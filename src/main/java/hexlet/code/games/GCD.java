package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class GCD {
    private static String question = "Find the greatest common divisor of given numbers.";
    private static Random random = new Random();
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void divisor() {
        Engine.runGame(question, collectData());
    }
    public static String[][] collectData() {
        String[][] answersAndQuestions = new String[Engine.COUNT_TO_WIN][2];
        for (int i = 0; i < Engine.COUNT_TO_WIN; i++) {
            int firstNumber = random.nextInt(MAX_RANDOM_NUMBER);
            int secondNumber = random.nextInt(MAX_RANDOM_NUMBER);
            answersAndQuestions[i][0] = firstNumber + " " + secondNumber;
            answersAndQuestions[i][1] = String.valueOf(findGcd(firstNumber, secondNumber));
        }
        return answersAndQuestions;
    }

    public static int findGcd(int firstNumber, int secondNumber) {
        int gcd = 1;
        for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
            }
        } return gcd;
    }
}
