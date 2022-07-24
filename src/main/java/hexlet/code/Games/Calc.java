package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static String calculate() {
        var name = Engine.gameGreeting();
        System.out.println("What is the result of the expression?");
        final int countToWin = 3;
        int indexRightAnswers = 0;
        while (indexRightAnswers < countToWin) {
            var firstNumber = Engine.randomFirstNumber();
            var secondNumber = Engine.randomSecondNumber();
            var firstNumberString = Integer.toString(firstNumber);
            var secondNumberString = Integer.toString(secondNumber);
            char operChar = ' ';
            int example = 0;
            Random random = new Random();
            final int currentOperator = random.nextInt(3);

            switch (currentOperator) {
                case 0 -> {
                    example = firstNumber + secondNumber;
                    operChar = '+';
                }
                case 1 -> {
                    example = firstNumber - secondNumber;
                    operChar = '-';
                }
                case 2 -> {
                    example = firstNumber * secondNumber;
                    operChar = '*';
                }
                default -> {
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
                return ans + " is wrong answer ;(. Correct answer was " + example + " \nLet's try again, "
                        + name + "!";
            }
        } return "Congratulations, " + name + "!";
    }
}


