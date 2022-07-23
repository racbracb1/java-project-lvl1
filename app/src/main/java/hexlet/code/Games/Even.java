package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Scanner;


public class Even {
    public static String parityCheck() {
        var name = Engine.gameGreeting();
        final int countToWin = 3;
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int indexRightAnswers = 0;
        while (indexRightAnswers < countToWin) {
            int randomNumber = Engine.randomFirstNumber();
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
