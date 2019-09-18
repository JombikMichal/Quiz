package generateQuiz;

import java.util.*;

public class QuestionsHolder {

    private Map<String, String[]> correctAnswerQuestionSingleMap;
    private Map<String, String[]> correctAnswerQuestionMultiMap;
    private Map<String, Map<String,String>> questionWithPossibleAnswers;
    private List<String> singleQuestions = new ArrayList<>();
    private List<String> multiQuestions = new ArrayList<>();

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

    public StringBuilder getCorrectAnswer(String question, AbstractQuestion abstractQuestion){
        Map<String, String[]> correctMap = this.correctAnswerQuestionSingleMap;
        if (abstractQuestion instanceof MultiAnswerQuestion){
            correctMap = this.correctAnswerQuestionMultiMap;
        }
        StringBuilder correctAnswer = new StringBuilder();
        for (String key : this.questionWithPossibleAnswers.keySet()){
            if(key.equals(question)){
                for (String k : this.questionWithPossibleAnswers.get(key).keySet()){
                    for (String t : correctMap.keySet()){
                        if (t.equals(question)){
                            for (int i = 0; i < correctMap.get(t).length; i++){
                                if (this.questionWithPossibleAnswers.get(key).get(k).trim().equals(correctMap.get(t)[i].trim())){
                                    correctAnswer.append(k);
                                }
                            }
                        }
                    }
                }
            }
        }
        return correctAnswer;
    }

    private void initialize() {
        this.correctAnswerQuestionSingleMap = new HashMap<>() {{
            put("What is 2 + 2?", new String[]{"4"});
            put("What is 3 + 9?",new String[] {"12"});
            put("What is 2 * 9?",new String[] {"18"});
            put("What is 2 + 5?",new String[] {"7"});
            put("What is 2 / 2?",new String[] {"1"});
            put("What is 4 / 2?",new String[] {"2"});
            put("What is 20 + 2?",new String[] {"22"});
            put("What is 20 - 2?",new String[] {"18"});
            put("What is 22 + 22?",new String[] {"44"});
            put("What is 2 * 0?",new String[] {"0"});
        }};

        this.correctAnswerQuestionMultiMap = new HashMap<>() {{
            put("4 = ?",new String[] {"2^2","1+3","4^1"});
            put("9 = ?",new String[] {"3^2","1+8"});
            put("14 = ?",new String[] {"10+4","12+2"});
            put("100 = ?",new String[] {"10^2","10*10"});
            put("36 = ?",new String[] {"6^2","6*6","30+6","40-4"});
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
                put("a","2^2");
                put("b","3^2");
                put("c","1+8");
                put("d","4^1");
            }});
            put("14 = ?", new HashMap<>(){{
                put("a","12+2");
                put("b","3^2");
                put("c","10+4");
                put("d","4^1");
            }});
            put("100 = ?", new HashMap<>(){{
                put("a","2^2");
                put("b","10^2");
                put("c","1+3");
                put("d","10*10");
            }});
            put("36 = ?", new HashMap<>(){{
                put("a","6^2");
                put("b","6*6");
                put("c","30+6");
                put("d","40-4");
            }});
        }};
    }

    public Map<String, String[]> getCorrectAnswerQuestionSingleMap() {
        return correctAnswerQuestionSingleMap;
    }

    public Map<String, String[]> getCorrectAnswerQuestionMultiMap() { return correctAnswerQuestionMultiMap; }
}
