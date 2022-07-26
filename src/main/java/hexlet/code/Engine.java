package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static String gameGreeting() {
        Scanner nameUser = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = nameUser.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }

    public static int randomNumber() {
        final int randomTill = 100;
        return (int) (Math.random() * randomTill + 1);
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
}
