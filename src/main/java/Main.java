import generator.QuizGenerator;
import generator.SingleAnswerQuestion;
import generator.SingleAnswerQuestionGenerator;

import java.security.SecureRandom;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do{
            final String playerName;
            SingleAnswerQuestionGenerator singleAnswerQuestionGenerator = new SingleAnswerQuestionGenerator();


            System.out.println("Hello player! What is your name?");
            playerName = scanner.next();
            System.out.println("Hello " + playerName + "! Welcome to my Math Quiz! This Quiz will have a few questions. Questions could contains one or more correct answers! Good luck "
            + playerName +"!!!");
            System.out.println("***** START QUIZ!!! *****");

            System.out.println(singleAnswerQuestionGenerator.getQuestionHolder().getCorrectAnswerQuestionMap());



//
//            for (String key : singleAnswerQuestion.generateQuestion().keySet()) {
//                System.out.println(key);
//                for ( Character keyAnswer : singleAnswerQuestion.getAnswers(singleAnswerQuestion.generateQuestion().get(key)).keySet() ) {
////                    System.out.println(singleAnswerQuestion.getAnswers(singleAnswerQuestion.generateQuestion().get(key)).get(keyAnswer));
//
//                    System.out.println(singleAnswerQuestion.getAnswers(key));
//
//                    //answers = singleAnswerQuestion.getAnswers(singleAnswerQuestion.generateQuestion().get(key)).get(keyAnswer);
//
//                }
//                System.out.println(singleAnswerQuestion.getAnswers(singleAnswerQuestion.generateQuestion().get(key)).get(scanner.next().charAt(0)));
//                //singleAnswerQuestion.ev(key,scanner.next().charAt(0));
//            }

            scanner.next();

        }while (true);

    }

}
