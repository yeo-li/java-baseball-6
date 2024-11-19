package baseball.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AnswerValidatorTest {

    @ParameterizedTest
    @CsvSource(value = {
            "12",
            "123",
            "12345"
    })
    void 길이가_1_이상이라면_예외를_발생시킨다(String errorInput) {
        // then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    // when
                    AnswerValidator.validate(errorInput);
                }
        );
    }

    @ParameterizedTest
    @CsvSource(value = {
            "3",
            "a",
            "0",
            "*"
    })
    void 입력값이_1_2_이외의_값이_들어오면_예외를_발생_시킨다(String errorInput) {
        // then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    // when
                    AnswerValidator.validate(errorInput);
                }
        );
    }
}