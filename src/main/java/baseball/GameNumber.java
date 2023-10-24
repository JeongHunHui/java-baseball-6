package baseball;

import java.util.ArrayList;
import java.util.List;

public class GameNumber {

    private List<Integer> numbers;

    private GameNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static GameNumber makeGameNumberByInput(String input) {
        InputValidator.validateInputAnswer(input);
        return new GameNumber(inputToNumbers(input));
    }

    private static List<Integer> inputToNumbers(String input) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (Character c : input.toCharArray()) {
            numbers.add(Character.getNumericValue(c));
        }
        return numbers;
    }
}
