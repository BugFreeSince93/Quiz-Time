package edu.unca.csci201;

public class QuizTime {

    public static void main(String[] args) {
        Quiz q = new Quiz();
        TrueFalseQuestion z;
        System.out.println("This is a quiz, there will be no leinency for lazy answers");
        System.out.println("If you do not obey the paramaters for properly answering a question, I will consider it false")
        System.out.println("If no paramaters are given, it is a short answer question. Please capitalize the first letter of your words");
        System.out.println("Kids these days seem to type in all sorts of crazy ways");
        System.out.println("#MakeWritingGreatAgain");
                
        
            (T/F)
        
        
        A:  B:  C:  D:
        
        MultipleChoiceQuestion three = new MultipleChoiceQuestion("What is the best number: A: 5,  B: 1, C: 10, D: 5", "5");
        ShortAnswerQuestion one = new ShortAnswerQuestion("Will your answer to this question be no?", "Yes");
        MultipleChoiceQuestion three = new MultipleChoiceQuestion("What if there were no hypothetical situations? A: We would have none B: Everything is hypothetical C: Nothing is hypothetical D: This question is hypo-ethical","D" " "");
        ShortAnswerQuestion one = new ShortAnswerQuestion("Where would we be without rhetorical questions?","");
        TrueFalseQuestion one = new TrueFalseQuestion("(T/F) You can pick your friends, and you can pick your nose, but you can't pick your friend's nose", "F");

        
        MultipleChoiceQuestion three = new MultipleChoiceQuestion("pq != qp A: True B: False C: You definitely know your math better than I do", "C");
        TrueFalseQuestion one = new TrueFalseQuestion("Rock is just a lot of loud noise", "F");
        MultipleChoiceQuestion three = new MultipleChoiceQuestion("What is something that you are quite proud of now, but in 5 years might look back on and be embarrassed by? A: Your Code B: Your cornrows C: Saying YOLO D: You have no Shame", "D");
        MultipleChoiceQuestion three = new MultipleChoiceQuestion("Have we found ourselves within a strange loop? A: Yes B: No C: Have we found ourselves within a strange loop?", "C");
        TrueFalseQuestion one = new TrueFalseQuestion("Have we found ourselves within a strange loop?", "T");
                
        TrueFalseQuestion one = new TrueFalseQuestion("(T/F) If all people are fruits, and all fruits are sweet, does it follow that all people are sweet?", "F");
TrueFalseQuestion one = new TrueFalseQuestion("(T/F) Happy wife, happy life", "T");
 ShortAnswerQuestion one = new ShortAnswerQuestion("What is the answer to the Ultimate Question of Life, the Universe, and Everything", "42");
        ShortAnswerQuestion one = new ShortAnswerQuestion("It's not a bug its a __", "Feature");
         TrueFalseQuestion one = new TrueFalseQuestion("Is this a grammatically correct sentence: Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo", (T));
MultipleChoiceQuestion three = new MultipleChoiceQuestion(in theory do strings have more gravity as a mutable or immutable object A: in special cases B: its all relative C: I quantumderstand the weight of this question" + "C");
        

MultipleChoiceQuestion three = new MultipleChoiceQuestion();
        MultipleChoiceQuestion three = new MultipleChoiceQuestion();
 TrueFalseQuestion one = new TrueFalseQuestion("Is this a grammatically correct sentence: Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo", (T));
       TrueFalseQuestion one = new TrueFalseQuestion("space is only noise if you can see", "T");
       
       TrueFalseQuestion one = new TrueFalseQuestion();
        
       
        ShortAnswerQuestion one = new ShortAnswerQuestion("A buddhist approaches a hotdogstand and he says:", "Make me one with everything");
        ShortAnswerQuestion one = new ShortAnswerQuestion(There are 10 types of people in the world);
        ShortAnswerQuestion one = new ShortAnswerQuestion();
        ShortAnswerQuestion one = new ShortAnswerQuestion();
        
                TrueFalseQuestion one = new TrueFalseQuestion("Did I make a mistake turning this in a couple minutes late", "F");
                        TrueFalseQuestion one = new TrueFalseQuestion("I thought so, it has been my pleasure to try to amuse you. Are you not amused?", "F");


        
        
        
        

        q.addQuestion(one);
        q.addQuestion(two);
        q.addQuestion(three);
        q.addQuestion(four);
        q.addQuestion(five);
        q.addQuestion(six);
        q.addQuestion(seven);
        q.addQuestion(eight);
        q.addQuestion(nine);
        q.addQuestion(ten);
        q.addQuestion(eleven);
        q.addQuestion(twelve);
        q.addQuestion(thirteen);
        q.addQuestion(fourteen);
        q.addQuestion(fifteen);
        q.addQuestion(sixteen);
        q.addQuestion(seventeen);
        q.addQuestion(eighteen);
        q.addQuestion(nineteen);
        q.addQuestion(twenty);
        q.addQuestion(twentOne);
        q.addQuestion(twentyTwo);
        q.addQuestion(twentyThree);
        q.addQuestion(twentyFour);
        q.addQuestion(twentyFive);

        q.giveQuiz(q);

       
     
    }

}
