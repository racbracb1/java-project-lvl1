package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class GCD {
    private static String question = "Find the greatest common divisor of given numbers.";

    public static void divisor() {
        Engine.gameEngine(question, gameData());
    }
    public static String[][] gameData() {
        String[][] answersAndQuestions = new String[Engine.COUNT_TO_WIN][2];
        for (int i = 0; i < Engine.COUNT_TO_WIN; i++) {
            int firstNumber = Utils.randomNumber();
            int secondNumber = Utils.randomNumber();
            answersAndQuestions[i][0] = firstNumber + " " + secondNumber;
            answersAndQuestions[i][1] = String.valueOf(gcd(firstNumber, secondNumber));
        }
        return answersAndQuestions;
    }

    public static int gcd(int firstNumber, int secondNumber) {
        int gcd = 1;
        for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
            }
        } return gcd;
    }
}
