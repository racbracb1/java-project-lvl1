package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Scanner;


public class Even {
    public static String parityCheck() {
        var name = Engine.gameGreeting();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        int indexRightAnswers = 0;
        while (indexRightAnswers < 3) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your anwser: ");
            Scanner answer = new Scanner(System.in);
            String ans = answer.nextLine();
        if ((randomNumber % 2 == 0 && ans.equals("yes")) || (randomNumber % 2 != 0 && ans.equals("no"))) {
            System.out.println("Correct!");
            indexRightAnswers++;
        } else if ((randomNumber % 2 == 0 && ans.equals("no"))) {
            System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n" +
                    "Let's try again, " + name + "!");
            indexRightAnswers = 0;
        } else if (randomNumber % 2 != 0 && ans.equals("yes")) {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again, " + name + "!");
            indexRightAnswers = 0;
        } else {
            System.out.println("Wrong answer");
            indexRightAnswers = 0;
        }

    }
        return "Congratulations, " + name + "!";
}
}