package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;



public class Even {
    private static String question = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void parityCheck() {
        Engine.gameEngine(question, gameData());
    }
    public static String[][] gameData() {

        String[][] answersAndQuestions = new String[Engine.COUNT_TO_WIN][2];
        for (int i = 0; i < Engine.COUNT_TO_WIN; i++) {
            int number = Utils.randomNumber();
            answersAndQuestions[i][0] = String.valueOf(number);
            answersAndQuestions[i][1] = isEven(number) ? "yes" : "no";
        } return answersAndQuestions;
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
