package edu.unca.csci201;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz {

    private int score;
    public ArrayList<Question> listOfQuestions;
    public ArrayList<Question> listOfIncorrectQuestion;
    public ArrayList<String> listOfIncorrectInput;

    Question[] arrayOfQuestions;
    private int correct;
    private int incorrect;

    public Quiz() {
        listOfQuestions = new ArrayList<>();
        listOfIncorrectInput = new ArrayList<>();
        listOfIncorrectQuestion = new ArrayList<>();

    }

    public void addQuestion(Question q) {
        listOfQuestions.add(q);
    }

    public void showIncorrectAnswers() {
        System.out.println("Shall we review the questions you answered incorrectly?");

        int z = 0;
        for (int i = 0; i < listOfIncorrectQuestion.size(); i++) {
            System.out.print("Incorrect Question " + z);
            System.out.println();
            System.out.print(listOfIncorrectQuestion.get(i).getQuestion());
            System.out.println();
            System.out.println();

            System.out.print("This was your answer: ");
            System.out.println();
            System.out.print(listOfIncorrectInput.get(i));
            System.out.println();
            System.out.println();

            System.out.print("This is the correct answer: ");
            System.out.print(listOfIncorrectQuestion.get(i).getCorrectAnswer());
            System.out.println("\n");
            z++;
        }

    }

    public double giveQuiz(Quiz q) {
        String thisQuestion;
        float scorePerc;

        listOfQuestions.forEach((question) -> { //thank you netbeans for weird syntactical options
            String givenAnswer;
            Scanner scan;

            System.out.println(question.getQuestion());
            scan = new Scanner(System.in);
            givenAnswer = scan.nextLine();

            if (question.isCorrectAnswer(givenAnswer)) {

                score++;

            } else {
                listOfIncorrectQuestion.add(question);

                listOfIncorrectInput.add(givenAnswer);
            }
        });

        scorePerc = ((float) score / (float) listOfQuestions.size()) * 100;

        System.out.println(score + " out of " + listOfQuestions.size() + ": " + scorePerc);

        showIncorrectAnswers();

        return score;
    }
}
