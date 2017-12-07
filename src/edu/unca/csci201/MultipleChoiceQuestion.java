package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {

    public static String typeOfQuestion = "MultipleChoiceQuestion";
    private String question;
    private String correctAnswer;
    private String givenAnswer;

    public MultipleChoiceQuestion(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        // TODO Auto-generated constructor stub
    }

    public String getQuestion() {
        // TODO Auto-generated method stub
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

}
