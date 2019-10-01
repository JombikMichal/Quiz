package question_list;

import question.Answer;
import question.Question;

import java.util.*;

public class QuestionsHolder {

    public QuestionsHolder() {}

    public static List<Question> createSingleAns(){
        //Object mapper JSON, java json deserialize

        List<Question> questions = new ArrayList<>();

        List<Answer> answers  = Arrays.asList(new Answer("4",true),new Answer("5",false),new Answer("9",false),new Answer("7",false));
        questions.add(new Question("What is 2 + 2?",answers));

        answers = Arrays.asList(new Answer("14",false),new Answer("1+8",false),new Answer("18",true),new Answer("10",false));
        questions.add(new Question("What is 2 * 9?",answers));

        answers = Arrays.asList(new Answer("7",true),new Answer("3*2",false),new Answer("3^2",false),new Answer("8",false));
        questions.add(new Question("What is 2 + 5 ?",answers));

        answers = Arrays.asList(new Answer("14",false),new Answer("1",true),new Answer("2",false),new Answer("0",false));
        questions.add(new Question("What is 2 / 2?",answers));

//        answers = Arrays.asList(new Answer("4",false),new Answer("1+1",true),new Answer("3^2",false),new Answer("6",false));
//        questions.add(new Question("What is 4 / 2?",answers));
//
//        answers = Arrays.asList(new Answer("12",false),new Answer("22",true),new Answer("33",false),new Answer("44",false));
//        questions.add(new Question("What is 20 + 2?",answers));
//
//        answers = Arrays.asList(new Answer("14",false),new Answer("1+8",false),new Answer("18",true),new Answer("17",false));
//        questions.add(new Question("What is 20 - 2?",answers));
//
//        answers = Arrays.asList(new Answer("0",false),new Answer("1+8",false),new Answer("3^2",false),new Answer("4",true));
//        questions.add(new Question("What is 2 * 2?",answers));
//
//        answers = Arrays.asList(new Answer("4",false),new Answer("1+8",true),new Answer("3^2",true),new Answer("17",false));
//        questions.add(new Question("9 = ?",answers));
//
//        answers = Arrays.asList(new Answer("4^1",true),new Answer("2^2",true),new Answer("3+1",true),new Answer("17",false));
//        questions.add(new Question("4 = ?",answers));
//
//        answers = Arrays.asList(new Answer("4^1",false),new Answer("10+4",true),new Answer("3+1",false),new Answer("12+2",true));
//        questions.add(new Question("14 = ?",answers));
//
//        answers = Arrays.asList(new Answer("10^2",true),new Answer("2^2",false),new Answer("3+1",false),new Answer("10*10",true));
//        questions.add(new Question("100 = ?",answers));
//
        answers = Arrays.asList(new Answer("6^2",true),new Answer("6*6",true),new Answer("30+6",true),new Answer("40-4",true));
        questions.add(new Question("36 = ?",answers));

        return questions;
    }

}
