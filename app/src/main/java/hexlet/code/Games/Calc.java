package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static String calculate() {
        var name = Engine.gameGreeting();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");

        int indexRightAnswers = 0;
        while (indexRightAnswers < 3) {
            var firstNumber = (int) (Math.random() * 100);
            var secondNumber = (int) (Math.random() * 100);
            var firstNumberString = Integer.toString(firstNumber);
            var secondNumberString = Integer.toString(secondNumber);
            char operatorChar;
            int example;

            Random random = new Random();
            int currentOperator = random.nextInt(3);

            switch (currentOperator) {
                case 0:
                    example = firstNumber + secondNumber;
                    operatorChar = '+';
                    System.out.println("Question: " + firstNumberString + " " + operatorChar + " " + secondNumberString);
                    System.out.println("Your anwser: ");
                    Scanner answer = new Scanner(System.in);
                    int ans = answer.nextInt();
                    if (ans == example) {
                        System.out.println("Correct!");
                        indexRightAnswers++;
                    } else  {
                        return ans + " is wrong answer ;(. Correct answer was " + example + " \nLet's try again, " + name;
                    }
                    break;
                case 1:
                    example = firstNumber - secondNumber;
                    operatorChar = '-';
                    System.out.println("Question: " + firstNumberString + " " + operatorChar + " " + secondNumberString);
                    System.out.println("Your anwser: ");
                    Scanner answerMin = new Scanner(System.in);
                    ans = answerMin.nextInt();
                    if (ans == example) {
                        System.out.println("Correct!");
                        indexRightAnswers++;
                    } else  {
                        return ans + " is wrong answer ;(. Correct answer was " + example + " \nLet's try again, " + name;
                    }
                    break;
                case 2:
                    example = firstNumber * secondNumber;
                    operatorChar = '*';
                    System.out.println("Question: " + firstNumberString + " " + operatorChar + " " + secondNumberString);
                    System.out.println("Your anwser: ");
                    Scanner answerMult = new Scanner(System.in);
                    ans = answerMult.nextInt();
                    if (ans == example) {
                        System.out.println("Correct!");
                        indexRightAnswers++;
                    } else  {
                        return ans + " is wrong answer ;(. Correct answer was " + example + " \nLet's try again, " + name;
                    }
                    break;
            }
        } return "Congratulations, " + name + "!";
    }
}


