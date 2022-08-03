package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    static final char[] OPERATORS = new char[] {'+', '-', '*'};

    public static void calculate() {
        String question = "What is the result of the expression?";
        Engine.gameEngine(question, gameData());
    }
    public static String[][] gameData() {
        String[][] answersAndQuestions = new String[Engine.COUNT_TO_WIN][2];
        for (int i = 0; i < Engine.COUNT_TO_WIN; i++) {
            int firstNumber = Utils.randomNumber();
            int secondNumber = Utils.randomNumber();
            char operChar = OPERATORS[(int) (Math.random() * OPERATORS.length)];
            answersAndQuestions[i][0] = firstNumber + " " + operChar + " " + secondNumber;
            answersAndQuestions[i][1] = String.valueOf(calc(firstNumber, operChar, secondNumber));

        } return answersAndQuestions;
    }

    public static int calc(int numberOne, char operChar, int numberTwo) {
        int rightAnswer =  switch (operChar) {
            case '+' -> numberOne + numberOne;
            case '-' -> numberOne - numberTwo;
            case '*' -> numberOne * numberTwo;
            default -> throw new RuntimeException("Operation " + "'" + "'" + " defined");
        }; return rightAnswer;
    }
}


