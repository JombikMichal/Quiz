import generateQuiz.GenerateQuiz;
import generateQuiz.RandomNumberGenerator;
import generateQuiz.SingleAnswerQuestion;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int finish = 0;
        List<SingleAnswerQuestion> allQuestions;
        do{
            final String playerName;
            String answer;
            GenerateQuiz generateQuiz = new GenerateQuiz();
            allQuestions = generateQuiz.getQuestionList();


            System.out.println("Hello player! What is your name?");
            playerName = scanner.next();
            System.out.println("Hello " + playerName + "! Welcome to my Math Quiz! This Quiz will have a few questions. Questions could contains one or more correct answers! Good luck "
            + playerName +"!!!");
            System.out.println("***** START QUIZ!!! *****");


            for (SingleAnswerQuestion key : allQuestions){
                key.display();
                answer = scanner.next();
                key.evaluation(answer);
                finish++;
            }
            System.out.println("You had " + GenerateQuiz.winCount + "/" + allQuestions.size() +" answers correct");

        }while (finish < allQuestions.size());

    }

}
