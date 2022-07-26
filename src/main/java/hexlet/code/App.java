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
        int gameChoosed;
        gameChoosed = gameChoose.nextInt();
        switch (gameChoosed) {
            case 1 -> System.out.println(Cli.greeting());
            case 2 -> System.out.println(Even.parityCheck());
            case 3 -> System.out.println(Calc.calculate());
            case 4 -> System.out.println(GCD.divisor());
            case 5 -> System.out.println(Progression.progression());
            case 6 -> System.out.println(Prime.prime());
            default -> System.out.println(" ");
            }
        }
    }

