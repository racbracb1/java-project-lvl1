package hexlet.code;

import java.util.Scanner;


public class Engine {
    public static final int COUNT_TO_WIN = 3;
    public static String greetUser() {
        Scanner nameUser = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = nameUser.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void runGame(String question, String[][]answersAndQuestions) {
        Scanner nameUser = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = nameUser.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);
        for (int i = 0; i < COUNT_TO_WIN; i++) {
            System.out.println("Question: " + answersAndQuestions[i][0]);
            System.out.print("Your answer: ");
            Scanner ans = new Scanner(System.in);
            String answer = ans.nextLine();
            if (answer.equals(answersAndQuestions[i][1])) {
                System.out.println("Correct");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + answersAndQuestions[i][1]
                        + " \nLet's try again, " + name + "!");
                return;
            }

        } Engine.seeYou(name);

    }

    public static void seeYou(String name) {
        System.out.println("Congratulations, " + name + "!");
    }
}

