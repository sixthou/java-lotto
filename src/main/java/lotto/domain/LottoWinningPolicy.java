package lotto.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LottoWinningPolicy {

    private final Map<LottoRank, Integer> result = Arrays.stream(LottoRank.values())
        .collect(Collectors.toMap(Function.identity(), lottoRank -> 0));

    private final LottoWinningNumbers lottoWinningNumbers = new LottoWinningNumbers();

    public void setWinningNumber(final String winningNumbersString) {
        lottoWinningNumbers.selectWinningNumbers(winningNumbersString);
    }

    public List<Integer> getWinningNumber() {
        return lottoWinningNumbers.getWinningNumber();
    }

    public void setResult(LottoGame lottoGame) {
        List<LottoTicket> lottoTickets = lottoGame.getTickets();

        lottoTickets.forEach(lottoTicket -> result.put(lottoTicket.getLottoRank(),
            result.get(lottoTicket.getLottoRank()) + 1));
    }

    public Map<LottoRank, Integer> getResult() {
        return result;
    }

    public int getPrice() {
        int sum = 0;
        sum += result.get(LottoRank.FOURTH) * LottoRank.FOURTH.getPrice();
        sum += result.get(LottoRank.THIRD) * LottoRank.THIRD.getPrice();
        sum += result.get(LottoRank.SECOND) * LottoRank.SECOND.getPrice();
        sum += result.get(LottoRank.FIRST) * LottoRank.FIRST.getPrice();
        return sum;
    }
}
