package baseball.validator;

import baseball.constant.ErrorMessage;

public class NumberValidator {
    public static void validate(String userInput) {
        shouldBeNumberLength(userInput);
        shouldNotBeOverlap(userInput);
        shouldBeOnlyNumber(userInput);
    }

    private static void shouldBeNumberLength(String userInput) {
        if (userInput.length() != 3) {
            throw new IllegalArgumentException(ErrorMessage.SHOULD_BE_NUMBER_LENGTH.getErrorMessage());
        }
    }

    private static void shouldNotBeOverlap(String userInput) {
        String tmp = "";
        for (char c : userInput.toCharArray()) {
            if (tmp.contains(String.valueOf(c))) {
                throw new IllegalArgumentException(ErrorMessage.SHOULD_NOT_BE_OBERLAP.getErrorMessage());
            }
            tmp += String.valueOf(c);
        }
    }

    private static void shouldBeOnlyNumber(String userInput) {
        for (char c : userInput.toCharArray()) {
            if (!Character.isDigit(c) || c == '0') {
                throw new IllegalArgumentException(ErrorMessage.SHOULD_BE_ONLY_NUMBER.getErrorMessage());
            }
        }
    }

}
