package generateQuiz;

import java.util.*;

public class QuestionsHolder {
    private Map<String, String> correctAnswerQuestionSingleMap;
    private Map<String, String> correctAnswerQuestionMultiMap;

    private Map<String, Map<String,String>> questionWithPossibleAnswers;

    private List<String> singleQuestions = new ArrayList<>();
    private List<String> multiQuestions = new ArrayList<>();

    private String correctAnswer;



    public QuestionsHolder() {
        initialize();
    }


    public String getQuestions(int pos,AbstractQuestion abstractQuestion) {
        if (abstractQuestion instanceof MultiAnswerQuestion){
            return multiQuestions.get(pos);
        }
        return singleQuestions.get(pos);

    }

    public Map<String, String> getQuestionWithPossibleAnswers(String question) {
        return this.questionWithPossibleAnswers.get(question);

    }

    public String getCorrectAnswer(String question, AbstractQuestion abstractQuestion){
        Map<String, String> correctMap = this.correctAnswerQuestionSingleMap;
        if (abstractQuestion instanceof MultiAnswerQuestion){
            correctMap = this.correctAnswerQuestionMultiMap;
        }
        String ans = correctMap.get(question);
        for (String key : this.questionWithPossibleAnswers.keySet()){
            if(key.equals(question)){
                for (String k : this.questionWithPossibleAnswers.get(key).keySet()){
                    if(questionWithPossibleAnswers.get(key).get(k).equals(correctMap.get(question))){
                        correctAnswer = k;
                    }
                }
            }
        }
        return correctAnswer;
    }

    private void initialize() {

        this.correctAnswerQuestionSingleMap = new HashMap<>() {{
            put("What is 2 + 2?", "4");
            put("What is 3 + 9?", "12");
            put("What is 2 * 9?", "18");
            put("What is 2 + 5?", "7");
            put("What is 2 / 2?", "1");
            put("What is 4 / 2?", "2");
            put("What is 20 + 2?", "22");
            put("What is 20 - 2?", "18");
            put("What is 22 + 22?", "44");
            put("What is 2 * 0?", "0");
        }};

        this.correctAnswerQuestionMultiMap = new HashMap<>() {{
            put("4 = ?", "2^2");
            put("9 = ?", "3^2");
            put("14 = ?", "10+4");
            put("100 = ?", "10^2");
        }};

        for (String key : this.correctAnswerQuestionSingleMap.keySet()) {
            singleQuestions.add(key);
        }
        for (String key : this.correctAnswerQuestionMultiMap.keySet()) {
            multiQuestions.add(key);
        }

        this.questionWithPossibleAnswers = new HashMap<>() {{
            put("What is 2 + 2?", new HashMap<>(){{
                put("a","1");
                put("b","4");
                put("c","3");
                put("d","11");
            }});
            put("What is 3 + 9?", new HashMap<>(){{
                put("a","12");
                put("b","40");
                put("c","13");
                put("d","10");
            }});
            put("What is 2 * 9?", new HashMap<>(){{
                put("a","9");
                put("b","0");
                put("c","31");
                put("d","18");
            }});
            put("What is 2 + 5?", new HashMap<>(){{
                put("a","12");
                put("b","41");
                put("c","7");
                put("d","11");
            }});
            put("What is 2 / 2?", new HashMap<>(){{
                put("a","1");
                put("b","4");
                put("c","13");
                put("d","19");
            }});
            put("What is 4 / 2?", new HashMap<>(){{
                put("a","11");
                put("b","2");
                put("c","3");
                put("d","191");
            }});
            put("What is 20 + 2?", new HashMap<>(){{
                put("a","22");
                put("b","9");
                put("c","29");
                put("d","1");
            }});
            put("What is 20 - 2?", new HashMap<>(){{
                put("a","1");
                put("b","18");
                put("c","30");
                put("d","11");
            }});
            put("What is 22 + 22?", new HashMap<>(){{
                put("a","5");
                put("b","9");
                put("c","4");
                put("d","44");
            }});
            put("What is 2 * 0?", new HashMap<>(){{
                put("a","1");
                put("b","4");
                put("c","0");
                put("d","91");
            }});
            put("4 = ?", new HashMap<>(){{
                put("a"," 2^2");
                put("b","-2^2");
                put("c","1+3");
                put("d","4^1");
            }});
            put("9 = ?", new HashMap<>(){{
                put("a"," 2^2");
                put("b","3^2");
                put("c","1+3");
                put("d","4^1");
            }});
            put("14 = ?", new HashMap<>(){{
                put("a"," 2^2");
                put("b","3^2");
                put("c","10+4");
                put("d","4^1");
            }});
            put("100 = ?", new HashMap<>(){{
                put("a"," 2^2");
                put("b","10^2");
                put("c","1+3");
                put("d","4^1");
            }});
        }};
    }

    public Map<String, String> getCorrectAnswerQuestionSingleMap() {
        return correctAnswerQuestionSingleMap;
    }

    public Map<String, String> getCorrectAnswerQuestionMultiMap() { return correctAnswerQuestionMultiMap; }
}
