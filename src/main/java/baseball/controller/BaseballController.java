package baseball.controller;

import baseball.constant.Constant;
import baseball.util.StringParser;
import baseball.validator.AnswerValidator;
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

    public void runBaseballGame() {
        outputView.printGameStartMessage();
        List<Integer> answer = createRandomAnswer();
        progressBaseballGame(answer);
        restartGame();
    }

    public void progressBaseballGame(List<Integer> answer) {
        String userInput = inputNumbers();
        List<Integer> numbers = StringParser.parse(userInput);
        int strike = calculateStrike(answer, numbers);
        int ball = calculateBall(answer, numbers);
        outputView.printUserResult(strike, ball);
        if (isGameWinning(strike)) {
            outputView.printGameWinMessage();
            return;
        }
        progressBaseballGame(answer);
    }

    private boolean isGameWinning(int strike) {
        return strike == 3;
    }

    public List<Integer> createRandomAnswer() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < Constant.NUMBER_LENGTH.getConstant()) {
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
        for (int i = 0; i < Constant.NUMBER_LENGTH.getConstant(); i++) {
            if (answer.get(i) == numbers.get(i)) {
                strike++;
            }
        }
        return strike;
    }

    public int calculateBall(List<Integer> answer, List<Integer> numbers) {
        int ball = 0;
        for (int i = 0; i < Constant.NUMBER_LENGTH.getConstant(); i++) {
            for (int j = 0; j < Constant.NUMBER_LENGTH.getConstant(); j++) {
                if (j == i) {
                    continue;
                }
                if (answer.get(i) == numbers.get(j)) {
                    ball++;
                }
            }
        }
        return ball;
    }

    public String inputUserAnswer() {
        String userInput = inputView.inputUserAnswer();
        AnswerValidator.validate(userInput);
        return userInput;
    }

    public void restartGame() {
        String userAnswer = inputUserAnswer();
        if (userAnswer.equals("1")) {
            runBaseballGame();
        }
    }
}
