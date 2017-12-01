package edu.unca.csci201;

import java.util.ArrayList;
import java.util.Iterator;

public class Quiz {
	private int score;
	public ArrayList<Question> listOfQuestions;
	Question [] arrayOfQuestions;
	private int correct;
	private int incorrect;

	int i;

	public Quiz() {
            listOfQuestions = new ArrayList<>();
	}

	public void addQuestion(Question q) {
            listOfQuestions.add(q);
            
		

		//arrayOfQuestions = new Question [25];
		//for (; i < arrayOfQuestions.length; i++) {
			//arrayOfQuestions[i] = q;
			
		
		
	}



	public double giveQuiz(Quiz q) {
		Quiz myQuiz = q;
		String thisQuestion;
                
                for (Question question : listOfQuestions) {
                    System.out.println(question);
                }
             
                
                listOfQuestions.forEach((question)-> { //thank you netbeans
                    System.out.println(question);
                    });

                        
		
		return score;
	}
}