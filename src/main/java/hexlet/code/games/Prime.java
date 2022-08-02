package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class Prime {
    public static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void prime() {
        var name = Engine.gameGreeting();
        final int countToWin = 3;
        var randomNumber = Utils.randomNumber();
        int indexRightAnswers = 0;
        //System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (indexRightAnswers < countToWin) {
            boolean isSimple = true;
            Scanner answer = new Scanner(System.in);
            System.out.println("Question: " + randomNumber + "\nYour answer: ");
            String ans = answer.nextLine();
            int i = 2;
            while (i <= randomNumber / 2) {
                if (randomNumber % i == 0) {
                    isSimple = false;
                    break;
                }
                i++;
            }
            if (isSimple && ans.equals("yes") || !isSimple && ans.equals("no")) {
                System.out.println("Correct!");
                indexRightAnswers++;
            } else if (!isSimple && ans.equals("yes") || isSimple && ans.equals("no")) {
                System.out.println(ans + " is wrong answer ;(. \nLet's try again, " + name + "!");
                break;
            }

        }
        if (indexRightAnswers == countToWin) {
            Engine.seeYou(name);
        }
    }
}
