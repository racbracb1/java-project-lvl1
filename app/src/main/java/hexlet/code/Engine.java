package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String gameGreeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner userName = new Scanner(System.in);
        String name;
        name = userName.nextLine();
        return name;
    }
}
