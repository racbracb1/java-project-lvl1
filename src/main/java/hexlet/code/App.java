package hexlet.code;

import hexlet.code.Games.Prime;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Progression;

import java.util.Scanner;

public class App {
    static final int CHOICE_CLI = 1;
    static final int CHOICE_EVEN = 2;
    static final int CHOICE_CALC = 3;
    static final int CHOICE_GCD = 4;
    static final int CHOICE_PROGRESSION = 5;
    static final int CHOICE_PRIME = 6;
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner gameChoose = new Scanner(System.in);
        int gameChoosed = gameChoose.nextInt();
        switch (gameChoosed) {
            case CHOICE_CLI -> {
                System.out.println(Cli.greeting());
            }
            case CHOICE_EVEN -> {
                System.out.println(Even.parityCheck());
            }
            case CHOICE_CALC -> {
                System.out.println(Calc.calculate());
            }
            case CHOICE_GCD -> {
                System.out.println(GCD.divisor());
            }
            case CHOICE_PROGRESSION -> {
                System.out.println(Progression.progression());
            }
            case CHOICE_PRIME -> {
                System.out.println(Prime.prime());
            }
            default -> {
                System.out.println(" ");
            }
        }
    }
}

