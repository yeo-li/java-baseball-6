package baseball.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NumberValidatorTest {

    @ParameterizedTest
    @CsvSource(value = {
            "109",
            "a12",
            "1~9"
    })
    void 일에서_구_사이의_숫자가_아니라면_예외를_발생_시킨다(String errorInput) {
        // then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    // when
                    NumberValidator.validate(errorInput);
                }
        );
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1",
            "12",
            "112345",
            "1234",
            "1451412511"
    })
    void 세_자리수가_아니라면_예외를_발생_시킨다(String errorInput) {
        // then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    // when
                    NumberValidator.validate(errorInput);
                }
        );
    }

    @ParameterizedTest
    @CsvSource(value = {
            "119",
            "212",
            "777"
    })
    void 숫자가_중복되었다면_예외를_발생_시킨다(String errorInput) {
        // then
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    // when
                    NumberValidator.validate(errorInput);
                }
        );
    }

}