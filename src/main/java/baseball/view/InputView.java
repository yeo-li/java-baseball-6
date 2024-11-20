package baseball.view;

import baseball.constant.GameMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String inputNumbers() {
        System.out.print(GameMessage.INPUT_NUMBER.getGameMessage());
        return Console.readLine();
    }

    public String inputUserAnswer() {
        System.out.println(GameMessage.RESTART_OR_EXIT.getGameMessage());
        return Console.readLine();
    }
}
