package baseball.view;

import baseball.constant.GameMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String inputNumbers() {
        System.out.print(GameMessage.INPUT_NUMBER.getGameMessage());
        String userInput = Console.readLine();

        return userInput;
    }

    public String inputUserAnswer() {
        System.out.println(GameMessage.RESTART_OR_EXIT.getGameMessage());
        return Console.readLine();
    }
}
