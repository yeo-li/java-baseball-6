package baseball.validator;

public class NumberValidator {
    public static void validate(String userInput) {
        shouldBeLengthThree(userInput);
        shouldNotBeOverlap(userInput);
        shouldBeOnlyNumber(userInput);
    }

    private static void shouldBeLengthThree(String userInput) {
        if (userInput.length() != 3) {
            throw new IllegalArgumentException("입력값이 잘못되었습니다.");
        }
    }

    private static void shouldNotBeOverlap(String userInput) {
        String tmp = "";
        for (char c : userInput.toCharArray()) {
            if (tmp.contains(String.valueOf(c))) {
                throw new IllegalArgumentException("숫자가 중복되었습니다.");
            }
            tmp += String.valueOf(c);
        }
    }

    private static void shouldBeOnlyNumber(String userInput) {
        for (char c : userInput.toCharArray()) {
            if (!Character.isDigit(c) || c == '0') {
                throw new IllegalArgumentException("1~9 사이의 숫자만 입력해야합니다.");
            }
        }
    }

}
