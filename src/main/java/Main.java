import question.Question;
import question_list.QuestionsHolder;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Question> questions = QuestionsHolder.createSingleAns();


        final String playerName;
        System.out.println("Hello player! What is your name?");
        playerName = scanner.next();

        do{
            int correctAnswer = 0;
            String answer;
            System.out.println("Hello " + playerName + "! Welcome to my Math Quiz! This Quiz will have a few questions. Questions could contains one or more correct answers! Good luck "
                    + playerName +"!!!");
            System.out.println("***** START QUIZ!!! *****");


            for (Question question : questions){
                question.display();
                answer = scanner.next();
                if(question.evalute(answer)){
                    correctAnswer++;
                }
            }

            System.out.println("You had " + correctAnswer + "/" + questions.size() +" answers correct");
            System.out.println("Do you want to next Math Quiz?\nYes/No");
            if (!scanner.next().trim().equalsIgnoreCase("yes")){
                break;
            }

        }while (true);

    }

}
