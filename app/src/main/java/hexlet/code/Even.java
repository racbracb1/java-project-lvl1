package hexlet.code;

import java.util.Scanner;

public class Even {
    public static String parityCheck() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner userName = new Scanner(System.in);
        String name;
        name = userName.nextLine();
        System.out.println("Hello, " + name + "!");
        var answerYes = "yes";
        var answerNo = "no";
        int indexRightAnswers = 0;
        while (indexRightAnswers < 3) {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println(randomNumber);
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
