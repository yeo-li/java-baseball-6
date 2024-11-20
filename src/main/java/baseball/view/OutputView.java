package baseball.view;

import baseball.constant.GameMessage;

public class OutputView {

    public void printGameStartMessage() {
        System.out.println(GameMessage.GAME_START.getGameMessage());
    }

    public void printGameWinMessage() {
        System.out.println(GameMessage.GAME_WIN);
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
            result = GameMessage.NOTHING.getGameMessage();
        }
        return result;
    }

    private String createStrikeMessage(int strike) {
        String result = "";
        if (strike != 0) {
            result = strike + GameMessage.STRIKE.getGameMessage();
        }
        return result;
    }

    private String createBallMessage(int ball) {
        String result = "";
        if (ball != 0) {
            result += ball + GameMessage.BALL.getGameMessage() + " ";
        }
        return result;
    }
}
