package baseball.validator;

import baseball.constant.ErrorMessage;

public class AnswerValidator {

    public static void validate(String userInput) {
        shouldBeLengthOne(userInput);
        shouldBeOnlyOneOrTwo(userInput);
    }

    private static void shouldBeLengthOne(String userInput) {
        if (userInput.length() > 1) {
            throw new IllegalArgumentException(ErrorMessage.SHOULD_BE_LENGTH_ONE.getErrorMessage());
        }
    }

    private static void shouldBeOnlyOneOrTwo(String userInput) {
        if (!(userInput.equals("1") || userInput.equals("2"))) {
            throw new IllegalArgumentException(ErrorMessage.SHOULD_BE_ONLY_ONE_OR_TWO.getErrorMessage());
        }
    }

}
