package baseball.validator;

public class AnswerValidator {

    public static void validate(String userInput) {
        shouldBeLengthShorterThanOne(userInput);
        shouldBeOnlyOneOrTwo(userInput);
    }

    private static void shouldBeLengthShorterThanOne(String userInput) {
        if (userInput.length() > 1) {
            throw new IllegalArgumentException("1 또는 2만 입력 가능합니다.");
        }
    }

    private static void shouldBeOnlyOneOrTwo(String userInput) {
        if (!(userInput.equals("1") || userInput.equals("2"))) {
            throw new IllegalArgumentException("1 또는 2만 입력 가능합니다.");
        }
    }

}
