package lotto.domain;

import lotto.utils.LottoValidationUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static lotto.utils.CommonConstant.*;
import static lotto.utils.LottoValidationUtils.INVALID_DUPLICATION_NUMBER;
import static lotto.utils.LottoValidationUtils.PRINT_LOTTO_NUMBER;

public class LottoTicket {

    private List<Integer> lottoTicket;

    public LottoTicket() {
    }

    public LottoTicket(List<Integer> lottoTicket) {
        this.lottoTicket = lottoTicket;
        validateLottoRange(lottoTicket);
        validateLottoSize(lottoTicket);
        LottoNumberDuplication(lottoTicket);
    }

    public int getMatchCount(List<Integer> winningNumbers) {
        return IntStream.range(NUMBER_ZERO, lottoTicket.size())
                .map(i -> getContainsLottoNumber(winningNumbers, i))
                .sum();
    }

    private int getContainsLottoNumber(List<Integer> winningNumbers, int i) {
        return winningNumbers.contains(getLottoTicketNumber(i)) ? NUMBER_ONE : NUMBER_ZERO;
    }

    public void validateLottoRange(List<Integer> lottoTicket) {
        for (int number : lottoTicket) {
            LottoValidationUtils.lottoNumberRangeCheck(number);
        }
    }

    private void validateLottoSize(List<Integer> lottoTicket) {
        if (lottoTicket.size() != NUMBER_SIX) {
            throw new RuntimeException(PRINT_LOTTO_NUMBER);
        }
    }

    public void LottoNumberDuplication(List<Integer> lottoTicket) {
        IntStream.range(NUMBER_ZERO, lottoTicket.size())
                .filter(i -> IntStream.range(NUMBER_ZERO, i)
                .anyMatch(j -> lottoTicket.get(i).equals(lottoTicket.get(j))))
                .forEach(i -> {
                    throw new IllegalArgumentException(INVALID_DUPLICATION_NUMBER);
                });
    }

    public List<Integer> getLottoTicket() {
        return Collections.unmodifiableList(this.lottoTicket);
    }

    public int size() {
        return lottoTicket.size();
    }

    public Integer getLottoTicketNumber(int index) {
        return lottoTicket.get(index);
    }

    @Override
    public String toString() {
        return String.valueOf(lottoTicket);
    }

}