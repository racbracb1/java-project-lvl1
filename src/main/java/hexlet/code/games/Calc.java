package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    static final String[] OPERATORS = new String[] {"+", "-", "*"};
    public static String calculate() {
        var name = Engine.gameGreeting();
        System.out.println("What is the result of the expression?");
        final int countToWin = 3;
        int indexRightAnswers = 0;
        while (indexRightAnswers < countToWin) {
            var firstNumber = Engine.randomNumber();
            var secondNumber = Engine.randomNumber();
            var firstNumberString = Integer.toString(firstNumber);
            var secondNumberString = Integer.toString(secondNumber);
            char operChar = ' ';
            int example = 0;
            Random random = new Random();
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
                return Engine.calcLoose(ans, example, name);
            }
        } return "Congratulations, " + name + "!";
    }
}


