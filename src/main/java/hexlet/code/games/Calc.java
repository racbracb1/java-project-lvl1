package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class Calc {
    static final char[] OPERATORS = new char[] {'+', '-', '*'};
    private static String question = "What is the result of the expression?";
    private static Random random = new Random();
    private static int MAX_NUMBER = 100;

    public static void calculate() {

        Engine.runGame(question, collectData());
    }
    public static String[][] collectData() {
        String[][] answersAndQuestions = new String[Engine.COUNT_TO_WIN][2];
        for (int i = 0; i < Engine.COUNT_TO_WIN; i++) {
            int firstNumber = random.nextInt(MAX_NUMBER);
            int secondNumber = random.nextInt(MAX_NUMBER);
            char operChar = OPERATORS[(int) (Math.random() * OPERATORS.length)];
            int correctAnswer = chooseRandomOper(firstNumber, operChar, secondNumber);
            answersAndQuestions[i][0] = firstNumber + " " + operChar + " " + secondNumber;
            answersAndQuestions[i][1] = String.valueOf(correctAnswer);

        } return answersAndQuestions;
    }
    public static int chooseRandomOper(int numberOne, char operChar, int numberTwo) {
        return switch (operChar) {
            case '+' -> numberOne + numberTwo;
            case '-' -> numberOne - numberTwo;
            case '*' -> numberOne * numberTwo;
            default -> throw new RuntimeException("Operation " + "'" + "'" + " defined");
        };
    }
}


