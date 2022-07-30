package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even2;

public class Engine {
    public static final int COUNT_TO_WIN = 3;
    public static String gameGreeting() {
        Scanner nameUser = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = nameUser.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static void gameRule(String rule) {
        System.out.println(rule);
    }

    public static void gameEngine(String question, int example, String rightAnswer) {
        Scanner nameUser = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = nameUser.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);
        for (int i = 0; i < COUNT_TO_WIN; i = i + 1) {
            //int randomNumber = Utils.randomNumber();
            System.out.println(example);
            System.out.println("Your answer: ");
            System.out.println(Even2.getRightAnswer());
            System.out.println(i);
            Scanner ans = new Scanner(System.in);
            String answer = ans.nextLine();
            if (answer.equals(Even2.getRightAnswer())) {
                System.out.println("Correct");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + rightAnswer +
                        " \nLet's try again, " + name + "!!!!");
                return;
            }

        } Engine.seeYou(name);
    }

    public static String calcLoose(int answer, int example, String name) {
        return answer + " is wrong answer ;(. Correct answer was " + example + " \nLet's try again, "
                + name + "!";
    }
    public static String gcdLoose(int answer, int example, String name) {
        return answer + " is wrong answer ;(. Correct answer was " + example + " \nLet's try again, "
                + name + "!";
    }
    public static String progressionLoose(int answer, int number, String name) {
        return answer + " is wrong answer ;(. Correct answer was " + number + " \nLet's try again, "
                + name + "!";
    }

    public static void seeYou(String name) {
        System.out.println("Congratulations, " + name + "!");
    }
}

