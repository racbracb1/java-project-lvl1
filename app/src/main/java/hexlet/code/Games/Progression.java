package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static String progression() {
        var name = Engine.gameGreeting();
        int indexRightAnswers = 0;
        final int arraySize = 10;
        final int arraySizeMin = 5;
        final int randomStepMin = 2;
        final int countToWin = 3;
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");
        while (indexRightAnswers < countToWin) {
            Random random = new Random();
            int arrayLength = random.nextInt(arraySize) + arraySizeMin;
            int[] numbers = new int[arrayLength];
            int questionIndex = random.nextInt(arrayLength);
            int randomStep = random.nextInt(arraySize) + randomStepMin;
            int randomFirstNumber = random.nextInt(arraySize) + 1;
            System.out.print("Question: ");
            for (int i = 1; i < numbers.length; i++) {
                numbers[0] = randomFirstNumber;
                numbers[i] = numbers[i - 1] + randomStep;
            }
            int[] result = Arrays.copyOfRange(numbers, 0, numbers.length);
            for (int j = 0; j < questionIndex; j++) {
                System.out.print(result[j] + " ");
            }
            System.out.print(".. ");
            for (int j = questionIndex + 1; j < result.length; j++) {
                System.out.print(result[j] + " ");
            }
            Scanner answer = new Scanner(System.in);
            System.out.print("\nYour answer: ");
            int ans = answer.nextInt();
            if (ans == result[questionIndex]) {
                System.out.println("Correct!");
                indexRightAnswers++;
            } else {
                return ans + " is wrong answer ;(. Correct answer was " + result[questionIndex] + " \nLet's try again, "
                        + name;
            }
        } return "Congratulations, " + name + "!";
    }
}



