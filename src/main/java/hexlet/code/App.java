package hexlet.code;

import hexlet.code.Games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int startEvenGame = 2;
        final int startCalcGame = 3;
        final int startGcdGame = 4;
        final int startProgressionGame = 5;
        final int startPrimeGame = 6;
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
        int gameChoosed;
        gameChoosed = gameChoose.nextInt();
        if (gameChoosed == 1) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            System.out.println(Cli.greeting());
        } else if (gameChoosed == startEvenGame) {
            System.out.println(Even.parityCheck());
        } else if (gameChoosed == startCalcGame) {
            System.out.println(Calc.calculate());
        } else if (gameChoosed == startGcdGame) {
            System.out.println(GCD.divisor());
        } else if (gameChoosed == startProgressionGame) {
            System.out.println(Progression.progression());
        } else if (gameChoosed == startPrimeGame) {
            System.out.println(Prime.prime());

        }
    }
}
