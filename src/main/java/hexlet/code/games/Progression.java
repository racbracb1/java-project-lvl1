package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static String question = "What number is missing in the progression?";
    private static Random random = new Random();

    static final int ARRAYSIZE = 10;
    static final int ARRAYSIZEMIN = 5;
    private static int arrayLength = random.nextInt(ARRAYSIZE) + ARRAYSIZEMIN;
    static final int MAXRANDOMARRAYSTEP = 5;
    static final int MAXRANDOMFIRSTNUMBER = 10;


    public static void progression() {
        Engine.runGame(question, collectData());
    }
    public static String[][] collectData() {
        String[][] answersAndQuestions = new String[Engine.COUNT_TO_WIN][2];
        for (int i = 0; i < Engine.COUNT_TO_WIN; i++) {
            //Random random = new Random();
            int randomStep = random.nextInt(MAXRANDOMARRAYSTEP);
            int randomFirstNumber = random.nextInt(MAXRANDOMFIRSTNUMBER);
            int[] progression = createProgression(arrayLength, randomFirstNumber, randomStep);
            int questionIndex = random.nextInt(progression.length);
            String questionNumber = addQuestionNumber(progression, questionIndex);
            answersAndQuestions[i][0] = questionNumber;
            answersAndQuestions[i][1] = String.valueOf(progression[questionIndex]);
        } return answersAndQuestions;
    }

    public static int[] createProgression(int lengthArray, int randomFirstNumber, int randomStep) {
        int[] numbers = new int[lengthArray];
        for (int i = 1; i < numbers.length; i++) {
            numbers[0] = randomFirstNumber;
            numbers[i] = numbers[i - 1] + randomStep;
        } return numbers;
    }
    public static String addQuestionNumber(int[] array, int questionIndex) {
        StringBuilder progressionString = new StringBuilder();
        String numberString;
        for (var i = 0; i < array.length; i++) {
            numberString = String.valueOf(array[i]);
            if (i == questionIndex) {
                numberString = "..";
            }
            progressionString.append(numberString).append(" ");
        }
        return progressionString.toString();
    }
}

