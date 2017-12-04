package edu.unca.csci201;

import java.util.Scanner;

public class TrueFalseQuestion implements Question {

    public static String typeOfQuestion = "TrueFalseQuestion";
    private String question;
    private String correctAnswer;
    private String givenAnswer;

    public TrueFalseQuestion(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;

    }

    public String getQuestion() {
        return question;

    }

    public boolean isCorrectAnswer(String answer) {
        if (answer.equals(getCorrectAnswer())) {

            return true;

        }

        return false;
    }

    public String getCorrectAnswer() {
        // TODO Auto-generated method stub
        return correctAnswer;
    }

    public String getGivenAnswer() {
        return givenAnswer;

    }
}
