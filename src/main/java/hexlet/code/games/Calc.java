package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    static final String[] OPERATORS = new String[] {"+", "-", "*"};

    public static void calculate() {
        var name = Engine.gameGreeting();
        //var rule = Engine.gameRule("What is the result of the expression?");
        // System.out.println("What is the result of the expression?");
        final int countToWin = 3;
        int indexRightAnswers = 0;

        while (indexRightAnswers < countToWin) {
            var firstNumber = Utils.randomNumber();
            var secondNumber = Utils.randomNumber();
            var firstNumberString = Integer.toString(firstNumber);
            var secondNumberString = Integer.toString(secondNumber);
            Random random = new Random();
            char operChar = ' ';
            int example = 0;
            switch (OPERATORS[random.nextInt(OPERATORS.length)]) {
                case "+" -> {
                    example = firstNumber + secondNumber;
                    operChar = '+';
                }
                case "-" -> {
                    example = firstNumber - secondNumber;
                    operChar = '-';
                }
                case "*" -> {
                    example = firstNumber * secondNumber;
                    operChar = '*';
                }
                default -> {
                    System.out.println("For operator / no logic in Calc game");
                }
            }
            System.out.println("Question: " + firstNumberString + " " + operChar + " " + secondNumberString);
            System.out.println("Your anwser: ");
            Scanner answer = new Scanner(System.in);
            int ans = answer.nextInt();
            if (ans == example) {
                System.out.println("Correct!");
                indexRightAnswers++;
            } else {
                System.out.println(Engine.calcLoose(ans, example, name));
                break;
            }
        } if (indexRightAnswers == countToWin) {
            Engine.seeYou(name);
        }
    }

    //public static int calculating(int fi)
}


