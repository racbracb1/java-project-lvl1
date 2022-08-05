package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class Prime {
    private static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void prime() {
        Engine.runGame(question, collectData());
    }
    public static String[][] collectData() {
        String[][] answersAndQuestions = new String[Engine.COUNT_TO_WIN][2];
        for (int i = 0; i < Engine.COUNT_TO_WIN; i++) {
            int number = Utils.randomNumber();
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
