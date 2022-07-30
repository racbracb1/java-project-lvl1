package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even2 {
    public static int example = Utils.randomNumber();
    public static void parityCheck() {
        String question = "Answer 'yes' if number even otherwise answer 'no'.";
        int example = Utils.randomNumber();
        Engine.gameEngine(question, example, getRightAnswer());

        }


    public static String getRightAnswer() {
        if (example % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}

