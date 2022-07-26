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


}
