package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static String prime() {
        var name = Engine.gameGreeting();
        final int countToWin = 3;
        int indexRightAnswers = 0;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (indexRightAnswers < countToWin) {
            boolean isSimple = true;
            Random random = new Random();
            final int randomNumber = random.nextInt(100 + 1);
            Scanner answer = new Scanner(System.in);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
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
                return ans + " is wrong answer ;(. \nLet's try again, " + name + "!";
            }

        } return "Congratulations, " + name + "!";

    }
}
