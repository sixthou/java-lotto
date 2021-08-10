import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringAddCalculatorTest {

    @DisplayName("쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열 분리 테스트")
    @Test
    void string_split_test() {
        StringAddCalculator stringAddCalculator = new StringAddCalculator("1:2,3");
        assertThat(stringAddCalculator.getNumberList()).containsExactly("1","2","3");
    }

    @DisplayName("분리한 각 숫자의 합을 반환")
    @Test
    void divided_number_sum_test() {

    }

    @DisplayName("빈 문자열인 경우 0 반환 테스트")
    @Test
    void empty_string_return_zero_test() {
    }

    @DisplayName("null인 경우 0 반환 테스트")
    @Test
    void null_string_return_zero_test() {
    }

    @DisplayName("하나의 수만 문자열로 입력될 경우 해당 문자열 반환 테스트")
    @Test
    void single_number_string_return_own_test() {
    }

    @DisplayName("두개의 숫자, 구분자 ,입력할 경우 합을 반환 테스트")
    @Test
    void multiple_number_string_return_sum_test() {
    }

    @DisplayName("서로 다른 구분자를 사용했을 때도 합을 반환 테스트")
    @Test
    void multiple_delimiter_return_sum_test() {
    }

    @DisplayName("커스텀 구분자를 지정하여 사용했을 떄도 합을 반환 테스트.")
    @Test
    void custom_delimiter_return_sum_test() {
    }

    @DisplayName("문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw test.")
    @Test
    void not_number_string_throw_RuntimeException_test() {
    }
}
