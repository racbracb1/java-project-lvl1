package hexlet.code;

import hexlet.code.games.Prime;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    static final int CHOICE_CLI = 1;
    static final int CHOICE_EVEN = 2;
    static final int CHOICE_CALC = 3;
    static final int CHOICE_GCD = 4;
    static final int CHOICE_PROGRESSION = 5;
    static final int CHOICE_PRIME = 6;
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!" + "\nPlease enter the game number and press Enter.");
        System.out.println("1 - Greet" + "\n2 - Even" + "\n3 - Calc"
                + "\n4 - GCD" + "\n5 - Progression" + "\n6 - Prime" + "\n0 - Exit");
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
        }gameChoose.close();
    }
}

