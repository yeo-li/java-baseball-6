package baseball.view;

public class OutputView {

    public void printGameStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printGameWinMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printUserResult(int strike, int ball) {
        String strikeMessage = createStrikeMessage(strike);
        String ballMessage = createBallMessage(ball);
        String nothingMessage = createNothingMessage(strike, ball);

        System.out.println(nothingMessage + ballMessage + strikeMessage);
    }

    private boolean isNothing(int strike, int ball) {
        return strike == 0 && ball == 0;
    }

    private String createNothingMessage(int strike, int ball) {
        String result = "";
        if (isNothing(strike, ball)) {
            result = "낫싱";
        }
        return result;
    }

    private String createStrikeMessage(int strike) {
        String result = "";
        if (strike != 0) {
            result = strike + "스트라이크";
        }
        return result;
    }

    private String createBallMessage(int ball) {
        String result = "";
        if (ball != 0) {
            result += ball + "볼 ";
        }
        return result;
    }
}
