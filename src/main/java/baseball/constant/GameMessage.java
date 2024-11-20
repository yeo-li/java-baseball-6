package baseball.constant;

public enum GameMessage {
    GAME_START("숫자 야구 게임을 시작합니다."),
    GAME_WIN("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    INPUT_NUMBER("숫자를 입력해주세요 : "),
    RESTART_OR_EXIT("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요"),
    NOTHING("낫싱"),
    STRIKE("스트라이크"),
    BALL("볼");

    private final String gameMessage;

    GameMessage(String gameMessage) {
        this.gameMessage = gameMessage;
    }

    public String getGameMessage() {
        return gameMessage;
    }
}
