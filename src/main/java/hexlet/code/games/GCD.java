package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class GCD {
    public static void divisor() {
        int example;
        int indexRightAnswers = 0;
        final int countToWin = 3;
        var name = Engine.gameGreeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (indexRightAnswers < countToWin) {
            var firstNumber = Utils.randomNumber();
            var secondNumber = Utils.randomNumber();
            var firstNumberString = Integer.toString(firstNumber);
            var secondNumberString = Integer.toString(secondNumber);
            int gcd = 1;
            for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
                if (firstNumber % i == 0 && secondNumber % i == 0) {
                    gcd = i;
                }
            }
            example = gcd;
            System.out.println("Question: " + firstNumberString + " " + secondNumberString);
            System.out.println("Your answer: ");
            Scanner answer = new Scanner(System.in);
            int ans = answer.nextInt();
            if (ans == example) {
                System.out.println("Correct!");
                indexRightAnswers++;
            } else {
                System.out.println(Engine.gcdLoose(ans, example, name));
                break;
            }

        }
        if (indexRightAnswers == countToWin) {
            Engine.seeYou(name);
        }
    }
}


