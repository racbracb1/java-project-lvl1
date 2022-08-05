package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void prime() {
        Engine.runGame(question, collectData());
    }
    public static String[][] collectData() {
        Random random = new Random();
        String[][] answersAndQuestions = new String[Engine.COUNT_TO_WIN][2];
        for (int i = 0; i < Engine.COUNT_TO_WIN; i++) {
            int number = random.nextInt(MAX_RANDOM_NUMBER);
            answersAndQuestions[i][0] = String.valueOf(number);
            answersAndQuestions[i][1] = checkIsPrime(number) ? "yes" : "no";
        }
        return answersAndQuestions;
    }

    public static boolean checkIsPrime(int number) {
        boolean isSimple = true;
        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                isSimple = false;
                break;
            }
        } return isSimple;
    }
}
