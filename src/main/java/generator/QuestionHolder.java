package generator;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class QuestionHolder {
    private Map<String, String> correctAnswerQuestionMap;
    private Map<String, String> questionCollection;
    private RandomNumberGenerator randomNumberGenerator;
    private int [] nmbArray;


    public QuestionHolder() {
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
        this.randomNumberGenerator = new RandomNumberGenerator(4,this.correctAnswerQuestionMap.size());
        this.nmbArray = randomNumberGenerator.getNumbArray();
    }

    public Map<String, String> getCorrectAnswerQuestionMap() {
        for (int i= 0; i < nmbArray.length;i++){
            System.out.println("!!!!!!!!" + nmbArray[i]);

        }
        for (int i = 0; i < correctAnswerQuestionMap.size(); i++){
            System.out.println("((((("+correctAnswerQuestionMap.get(i));
        }
        return correctAnswerQuestionMap;
    }


    public void setCorrectAnswerQuestionMap(Map<String, String> correctAnswerQuestionMap) {
        this.correctAnswerQuestionMap = correctAnswerQuestionMap;
    }
}
