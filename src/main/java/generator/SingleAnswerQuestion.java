package generator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SingleAnswerQuestion implements QuizGenerator {
    private String question;
    private String answers;
    private Map<String, String> correctAnswerQuestionMap;
    private Map<String, Map<String, String>> AnswerQuestionMap;
    private Map<Character,String> possibleAnswers;


   public boolean ev(String question,char a){
      // System.out.println(possibleAnswers.get(a) + " " + question);
       if(correctAnswerQuestionMap.containsKey(question) && possibleAnswers.containsKey(a)){
           System.out.println("!!!!!"+ correctAnswerQuestionMap.get(question));
           System.out.println("!!!!!"+ possibleAnswers.get(a));
           if(Integer.parseInt(correctAnswerQuestionMap.get(question)) == Integer.parseInt(possibleAnswers.get(a))){
               System.out.println("KOKOT");
           }
             //  System.out.println("jjjjj"+ correctAnswerQuestionMap.get(question));
       }
       return false;
   }

//    @Override
//    public Map<Character, String> getAnswers(String answer){
//        int possibleAnswersOrder [] = new int[4];
//        Random random = new Random();
//        int correctAnswerPosition =  random.nextInt(4);
//        for(int i = 0; i < possibleAnswersOrder.length; i++){
//            if(i == correctAnswerPosition){
//                possibleAnswersOrder[i] = Integer.parseInt(answer);
//            }else {
//                possibleAnswersOrder[i] = Integer.parseInt(answer) + i + 1;
//            }
//        }
//        return possibleAnswers = new HashMap<>(){{
//            put('a', Integer.toString(possibleAnswersOrder[0]));
//            put('b', Integer.toString(possibleAnswersOrder[1]));
//            put('c', Integer.toString(possibleAnswersOrder[2]));
//            put('d', Integer.toString(possibleAnswersOrder[3]));
//        }};
//
//    }

    @Override
    public Map<Character, String> getAnswers(String question){
        int correctAnswer = Integer.parseInt(correctAnswerQuestionMap.get(question));
        int possibleAnswersOrder [] = new int[4];
        Random random = new Random();
        int correctAnswerPosition =  random.nextInt(4);
        for(int i = 0; i < possibleAnswersOrder.length; i++){
            if(i == correctAnswerPosition){
                possibleAnswersOrder[i] = correctAnswer;
            }else {
                possibleAnswersOrder[i] = correctAnswer + i + 1;
            }
        }
        return possibleAnswers = new HashMap<>(){{
            put('a', Integer.toString(possibleAnswersOrder[0]));
            put('b', Integer.toString(possibleAnswersOrder[1]));
            put('c', Integer.toString(possibleAnswersOrder[2]));
            put('d', Integer.toString(possibleAnswersOrder[3]));
        }};

    }

    @Override
    public Map<String, String> generateQuestion() {
        this.correctAnswerQuestionMap = new HashMap<>(){{
            put("What is 2 + 2? (Question with single answer)", "4");
            put("What is 3 + 9? (Question with single answer)", "12");
            put("What is 2 * 9? (Question with single answer)", "18");
            put("What is 2 + 5? (Question with single answer)", "7");
            put("What is 2 / 2? (Question with single answer)", "1");
            put("What is 4 / 2? (Question with single answer)", "2");
            put("What is 20 + 2? (Question with single answer)", "22");
            put("What is 20 - 2? (Question with single answer)", "18");
            put("What is 22 + 22? (Question with single answer)", "44");
            put("What is 2 * 0? (Question with single answer)", "0");
        }};
        return correctAnswerQuestionMap;

    }
}
