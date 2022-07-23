package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

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
            char operChar;
            int example;
            Random random = new Random();
            final int currentOperator = random.nextInt(3);

            switch (currentOperator) {
                case 0:
                    example = firstNumber + secondNumber;
                    operChar = '+';
                    System.out.println("Question: " + firstNumberString + " " + operChar + " " + secondNumberString);
                    System.out.println("Your anwser: ");
                    Scanner answer = new Scanner(System.in);
                    int ans = answer.nextInt();
                    if (ans == example) {
                        System.out.println("Correct!");
                        indexRightAnswers++;
                    } else {
                        return ans + " is wrong answer ;(. Correct answer was " + example + " \nLet's try again, "
                                + name;
                    }
                    break;
                case 1:
                    example = firstNumber - secondNumber;
                    operChar = '-';
                    System.out.println("Question: " + firstNumberString + " " + operChar + " " + secondNumberString);
                    System.out.println("Your anwser: ");
                    Scanner answerMin = new Scanner(System.in);
                    ans = answerMin.nextInt();
                    if (ans == example) {
                        System.out.println("Correct!");
                        indexRightAnswers++;
                    } else {
                        return ans + " is wrong answer ;(. Correct answer was " + example + " \nLet's try again, "
                                + name;
                    }
                    break;
                case 2:
                    example = firstNumber * secondNumber;
                    operChar = '*';
                    System.out.println("Question: " + firstNumberString + " " + operChar + " " + secondNumberString);
                    System.out.println("Your anwser: ");
                    Scanner answerMult = new Scanner(System.in);
                    ans = answerMult.nextInt();
                    if (ans == example) {
                        System.out.println("Correct!");
                        indexRightAnswers++;
                    } else {
                        return ans + " is wrong answer ;(. Correct answer was " + example + " \nLet's try again, "
                                + name;
                    }
                    break;
                default:
            }
        } return "Congratulations, " + name + "!";
    }
}


