package edu.unca.csci201;

public class QuizTime {

    public static void main(String[] args) {
        Quiz q = new Quiz();

        System.out.println("This is a quiz, there will be no leinency for lazy answers");
        System.out.println("If you do not obey the paramaters for answering these questions properly, I will consider your answer false");
        System.out.println("If no paramaters are given, it is a short answer question. Please capitalize the first letter of your words");
        System.out.println("Kids these days seem to type in all sorts of crazy ways");
        System.out.println("#MakeWritingGreatAgain");

        MultipleChoiceQuestion one = new MultipleChoiceQuestion("What is the best number: A: 5,  B: 1, C: 10, D: 5", "5");
        MultipleChoiceQuestion two = new MultipleChoiceQuestion("pq != qp A: True B: False C: You definitely know your math better than I do", "C");
        MultipleChoiceQuestion three = new MultipleChoiceQuestion("What if there were no hypothetical situations? A: We would have none B: Everything is hypothetical C: Nothing is hypothetical D: This question is hypo-ethical", "D");
        ShortAnswerQuestion four = new ShortAnswerQuestion("Where would we be without rhetorical questions?", "");
        TrueFalseQuestion five = new TrueFalseQuestion("(T/F) You can pick your friends, and you can pick your nose, but you can't pick your friend's nose", "F");

        TrueFalseQuestion six = new TrueFalseQuestion("(T / F) Rock is just a lot of loud noise", "F");
        MultipleChoiceQuestion seven = new MultipleChoiceQuestion("What is something that you are quite proud of now, but in 5 years might look back on and be embarrassed by? A: Your Code B: Your cornrows C: Saying YOLO D: You have no Shame", "D");
        ShortAnswerQuestion eight = new ShortAnswerQuestion("There are 10 types of people in the world: those who understand tertiary, those who don't, and___", "those who thought this was a binary joke");
        TrueFalseQuestion nine = new TrueFalseQuestion("(T/F) If all people are fruits, and all fruits are sweet, does it follow that all people are sweet?", "F");
        TrueFalseQuestion ten = new TrueFalseQuestion("(T/F) Happy wife, happy life", "T");

        ShortAnswerQuestion eleven = new ShortAnswerQuestion("What is the answer to the Ultimate Question of Life, the Universe, and Everything", "42");
        ShortAnswerQuestion twelve = new ShortAnswerQuestion("It's not a bug its a __", "Feature");
        TrueFalseQuestion thirteen = new TrueFalseQuestion("(T/F) Is this a grammatically correct sentence? Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo", "T");
        MultipleChoiceQuestion fourteen = new MultipleChoiceQuestion("In theory, do strings have more gravity as a mutable or immutable objects A: in special cases B: its all relative C: I quantumderstand this question, it would take quite a leap", "C");
        TrueFalseQuestion fifteen = new TrueFalseQuestion("(T/F)Is the following a grammatically correct sentence: James while John had had had had had had had had had had had a better effect on the teacher", "T");

        TrueFalseQuestion sixteen = new TrueFalseQuestion("(T/F) space is only noise if you can see", "T");
        ShortAnswerQuestion seventeen = new ShortAnswerQuestion("A buddhist approaches a hotdogstand and he says:", "Make me one with everything");
        ShortAnswerQuestion eighteen = new ShortAnswerQuestion("Why did the programmer quit his job?", "He didn't get arrays");
        ShortAnswerQuestion nineteen = new ShortAnswerQuestion("Will your answer to this question be no?", "Yes");
        ShortAnswerQuestion twenty = new ShortAnswerQuestion("A programmer is at work when his wife calls and asks him to go to the store. She says she needs a gallon of milk, and if they have fresh eggs, buy a dozen. What does he come home with?", "He comes home with 12 gallons of milk.");

        TrueFalseQuestion twentyOne = new TrueFalseQuestion("(T/F) If you pamper a cow, do you get spoiled milk?", "T");
        MultipleChoiceQuestion twentyTwo = new MultipleChoiceQuestion("Have we found ourselves within a strange loop? A: Yes B: No C: Have we found ourselves within a strange loop?", "C");
        TrueFalseQuestion twentyThree = new TrueFalseQuestion("(T/F) Have we found ourselves within a strange loop?", "T");
        TrueFalseQuestion twentyFour = new TrueFalseQuestion("(T/F) You were !ammused && cringe=true || You though this was a hoot", "T");
        TrueFalseQuestion twentyFive = new TrueFalseQuestion("(T/F) Are you surprised to hear that I was taken aback when I realized just how exceptionally this project exemplifies the skills we have be working to acquire", "T");

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
        q.addQuestion(twentyOne);
        q.addQuestion(twentyTwo);
        q.addQuestion(twentyThree);
        q.addQuestion(twentyFour);
        q.addQuestion(twentyFive);
        
        q.giveQuiz(q);
                
                
                
               
                

    }

}