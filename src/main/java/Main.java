import generateQuiz.AbstractQuestion;
import generateQuiz.GenerateQuiz;
import generateQuiz.Question;
import generateQuiz.QuestionsHolder;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int finish = 0;
        List<AbstractQuestion> allQuestions;

        List<Question> questions = QuestionsHolder.createSingleAns();


        final String playerName;
        System.out.println("Hello player! What is your name?");
        playerName = scanner.next();

        do{
            String answer;
            GenerateQuiz generateQuiz = new GenerateQuiz();
            allQuestions = generateQuiz.getQuestionList();
            System.out.println("Hello " + playerName + "! Welcome to my Math Quiz! This Quiz will have a few questions. Questions could contains one or more correct answers! Good luck "
                    + playerName +"!!!");
            System.out.println("***** START QUIZ!!! *****");


            for (Question question : questions){
                question.display();
                answer = scanner.next();
                if(question.evalute(answer)){
                    finish++;
                }
            }
            System.out.println(finish +"/" + questions.size());



//            for (AbstractQuestion key : allQuestions){
//                key.display();
//                answer = scanner.next();
//                key.evaluation(answer);
//                finish++;
//            }
            System.out.println("You had " + GenerateQuiz.winCount + "/" + allQuestions.size() +" answers correct");
            System.out.println("Do you want to next Math Quiz?\nYes/No");
            if (scanner.next().trim().equalsIgnoreCase("yes")){
                GenerateQuiz.winCount = 0;
                finish =0;
            }

        }while (finish < allQuestions.size());

    }

}
