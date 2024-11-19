package baseball.constant;

public enum ErrorMessage {
    SHOULD_BE_NUMBER_LENGTH("입력값의 길이는 3 이어야 합니다."),
    SHOULD_NOT_BE_OBERLAP("숫자는 중복되면 안됩니다."),
    SHOULD_BE_ONLY_NUMBER("1~9 사이의 숫자만 입력해야합니다."),
    SHOULD_BE_LENGTH_ONE("입력값의 길이는 1 이어야 합니다."),
    SHOULD_BE_ONLY_ONE_OR_TWO("1 또는 2만 입력 가능합니다.");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
