package baseball.controller;

import baseball.util.StringParser;
import baseball.validator.NumberValidator;
import baseball.view.InputView;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class BaseballController {

    private final InputView inputView;
    private final OutputView outputView;

    public BaseballController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void startBaseballGame() {
        outputView.printGameStartMessage();
        List<Integer> answer = createRandomAnswer();
        System.out.println("answer = " + answer);
        while (true) {
            String userInput = inputNumbers();
            List<Integer> numbers = StringParser.parse(userInput);

            int strike = calculateStrike(answer, numbers);
            int ball = calculateBall(answer, numbers);
            outputView.printUserResult(strike, ball);

            if (strike == 3) {
                outputView.printGameWinMessage();
                break;
            }
        }


    }

    public List<Integer> createRandomAnswer() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
        return numbers;
    }

    public String inputNumbers() {
        String userInput = inputView.inputNumbers();
        NumberValidator.validate(userInput);
        return userInput;
    }

    public int calculateStrike(List<Integer> answer, List<Integer> numbers) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (answer.get(i) == numbers.get(i)) {
                strike++;
            }
        }
        return strike;
    }

    public int calculateBall(List<Integer> answer, List<Integer> numbers) {
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    continue;
                }
                if (answer.get(i) == numbers.get(j)) {
                    ball++;
                }
            }
        }
        return ball;
    }
}
