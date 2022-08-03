/*package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progression2 {
    private static String question = "What number is missing in the progression?";
    static Random random = new Random();
    static int arrayLength = random.nextInt(arraySize) + arraySizeMin;
    int randomStep = random.nextInt(arraySize) + randomStepMin;
    int randomFirstNumber = random.nextInt(arraySize) + 1;
    static final int arraySize = 10;
    static final int arraySizeMin = 5;
    static final int randomStepMin = 2;


    public static void progression() {
        Engine.gameEngine(question, gameData());
    }
    public static String[][] gameData() {
        String[][] answersAndQuestions = new String[Engine.COUNT_TO_WIN][2];
        for (int i = 0; i < Engine.COUNT_TO_WIN; i++) {
            int number = Utils.randomNumber();
            answersAndQuestions[i][0] = Integer.toString(progressNumber());
            answersAndQuestions[i][1] = Integer.toString(progressNumber());
        } return answersAndQuestions;
    }

    public static String[] makeProgression(int arrayLength,int randomFirstNumber, int randomStep) {
        int[] numbers = new int[arrayLength];
        for (int i = 1; i < numbers.length; i++) {
            numbers[0] = randomFirstNumber;
            numbers[i] = numbers[i - 1] + randomStep;
        }
    }

    public static int progressNumber() {

        int questionIndex = random.nextInt(arrayLength);

        for (int i = 1; i < makeProgression().length; i++) {
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
        return numbers[questionIndex];
    }
}
*/
