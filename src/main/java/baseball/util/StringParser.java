package baseball.util;

import java.util.ArrayList;
import java.util.List;

public class StringParser {
    public static List<Integer> parse(String userInput) {
        List<Integer> numbers = new ArrayList<>();
        for (char c : userInput.toCharArray()) {
            numbers.add(Integer.parseInt(String.valueOf(c)));
        }
        return numbers;
    }
}
