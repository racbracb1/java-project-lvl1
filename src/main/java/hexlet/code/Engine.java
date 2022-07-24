package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static String gameGreeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner userName = new Scanner(System.in);
        String name;
        name = userName.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;

    }
    public static int randomFirstNumber() {
        final int randomTill = 100;
        return (int) (Math.random() * randomTill + 1);
    }

    public static int randomSecondNumber() {
        final int randomTill = 100;
        return (int) (Math.random() * randomTill + 1);
    }


}
