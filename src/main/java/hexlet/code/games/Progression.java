package hexlet.code.games;

import hexlet.code.Engine;


import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        var name = Engine.gameGreeting();
        int indexRightAnswers = 0;
        final int arraySize = 10;
        final int arraySizeMin = 5;
        final int randomStepMin = 2;
        final int countToWin = 3;
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
            for (int j = 0; j < questionIndex; j++) {
                System.out.print(numbers[j] + " ");
            }
            System.out.print(".. ");
            for (int j = questionIndex + 1; j < numbers.length; j++) {
                System.out.print(numbers[j] + " ");
            }
            Scanner answer = new Scanner(System.in);
            System.out.print("\nYour answer: ");
            int ans = answer.nextInt();
            if (ans == numbers[questionIndex]) {
                System.out.println("Correct!");
                indexRightAnswers++;
            } else {
                System.out.println(Engine.progressionLoose(ans, numbers[questionIndex], name));
                break;
            }
        }
        if (indexRightAnswers == countToWin) {
            Engine.seeYou(name);
        }
    }
}



