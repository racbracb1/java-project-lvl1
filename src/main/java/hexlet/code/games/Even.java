package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Even {
    private static String question = "Answer 'yes' if number even otherwise answer 'no'.";
    private static Random random = new Random();
    private static int MAX_NUMBER = 100;

    public static void checkParity() {
        Engine.runGame(question, collectData());
    }
    public static String[][] collectData() {
        String[][] answersAndQuestions = new String[Engine.COUNT_TO_WIN][2];
        for (int i = 0; i < Engine.COUNT_TO_WIN; i++) {
            int number = random.nextInt(MAX_NUMBER);
            answersAndQuestions[i][0] = String.valueOf(number);
            answersAndQuestions[i][1] = checkIsEven(number) ? "yes" : "no";
        } return answersAndQuestions;
    }


    public static boolean checkIsEven(int number) {
        return (number % 2 == 0);
    }
}
