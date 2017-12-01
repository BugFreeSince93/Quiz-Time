package edu.unca.csci201;

//Kenny Tram - ktram@unca.edu 
public class QuizTime {

		
	public static void main(String[] args) {
		Quiz q = new Quiz();
                TrueFalseQuestion z;
		
		TrueFalseQuestion one = new TrueFalseQuestion("is this right?","T");
		TrueFalseQuestion two = new TrueFalseQuestion("is this wrong?","F");
		
                
		q.addQuestion(one);
		q.addQuestion(two);
		
		q.giveQuiz(q);
		
            Question get = q.listOfQuestions.get(0);
            Question get1 = q.listOfQuestions.get(1);
            System.out.println(get1.getQuestion());
            
            System.out.println(get1 );
            System.out.println(get);
            //one.getCorrectAnswer();
            //one.isCorrectAnswer("T");

	}

}
