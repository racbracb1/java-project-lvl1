package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;


public class Even {
    public static String parityCheck() {
        var name = Engine.gameGreeting();
        final int countToWin = 3;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int indexRightAnswers = 0;
        while (indexRightAnswers < countToWin) {
            int randomNumber = Utils.randomNumber();
            System.out.println("Question: " + randomNumber);
            System.out.println("Your anwser: ");
            Scanner answer = new Scanner(System.in);
            String ans = answer.nextLine();
            if ((randomNumber % 2 == 0 && ans.equals("yes")) || (randomNumber % 2 != 0 && ans.equals("no"))) {
                System.out.println("Correct!");
                indexRightAnswers++;
            } else if ((randomNumber % 2 == 0 && ans.equals("no"))) {
                return "Answer '" + ans + "' is wrong answer ;(. Correct answer was " + "'yes'."
                        + " \nLet's try again, " + name + "!";
            } else if (randomNumber % 2 != 0 && ans.equals("yes")) {
                return "Answer '" + ans + "' is wrong answer ;(. Correct answer was " + "'no'."
                        + " \nLet's try again, " + name + "!";
            }
        }
        return "Congratulations, " + name + "!";
    }
}
