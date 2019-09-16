package generateQuiz;

import java.util.*;

public class QuestionsHolder {
    private Map<String, String> correctAnswerQuestionMap;
    private Map<String, Map<String,String>> questionWithPossibleAnswers;
    private List<String> questions = new ArrayList<>();
    private String correctAnswer;



    public QuestionsHolder() {
        initialize();
    }

    public String getQuestions(int pos) {
        return questions.get(pos);

    }

    public Map<String, String> getQuestionWithPossibleAnswers(String question) {
        return this.questionWithPossibleAnswers.get(question);

    }


    public String getCorrectAnswer(String question){
        String ans = this.correctAnswerQuestionMap.get(question);
        for (String key : this.questionWithPossibleAnswers.keySet()){
            for (String k : this.questionWithPossibleAnswers.get(key).keySet()){
                if(questionWithPossibleAnswers.get(key).get(k).equals(this.correctAnswerQuestionMap.get(question))){
                    correctAnswer = k;
                }
            }
        }
        return correctAnswer;
    }

    public Map<String, Map<String, String>> getQuestionWithPossibleAnswers() {
        return questionWithPossibleAnswers;
    }

    private void initialize() {
        this.correctAnswerQuestionMap = new HashMap<>() {{
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

        for (String key : this.correctAnswerQuestionMap.keySet()) {
            questions.add(key);
        }


        this.questionWithPossibleAnswers = new HashMap<>() {{
            put("What is 2 + 2? (Question with single answer)", new HashMap<>(){{
                put("a","1");
                put("b","4");
                put("c","3");
                put("d","11");
            }});
            put("What is 3 + 9? (Question with single answer)", new HashMap<>(){{
                put("a","12");
                put("b","40");
                put("c","13");
                put("d","10");
            }});
            put("What is 2 * 9? (Question with single answer)", new HashMap<>(){{
                put("a","9");
                put("b","0");
                put("c","31");
                put("d","18");
            }});
            put("What is 2 + 5? (Question with single answer)", new HashMap<>(){{
                put("a","12");
                put("b","41");
                put("c","7");
                put("d","11");
            }});
            put("What is 2 / 2? (Question with single answer)", new HashMap<>(){{
                put("a","1");
                put("b","4");
                put("c","13");
                put("d","19");
            }});
            put("What is 4 / 2? (Question with single answer)", new HashMap<>(){{
                put("a","11");
                put("b","2");
                put("c","3");
                put("d","191");
            }});
            put("What is 20 + 2? (Question with single answer)", new HashMap<>(){{
                put("a","8");
                put("b","9");
                put("c","22");
                put("d","1");
            }});
            put("What is 20 - 2? (Question with single answer)", new HashMap<>(){{
                put("a","1");
                put("b","18");
                put("c","30");
                put("d","11");
            }});
            put("What is 22 + 22? (Question with single answer)", new HashMap<>(){{
                put("a","5");
                put("b","9");
                put("c","44");
                put("d","1");
            }});
            put("What is 2 * 0? (Question with single answer)", new HashMap<>(){{
                put("a","1");
                put("b","4");
                put("c","0");
                put("d","91");
            }});
        }};
    }

    public Map<String, String> getCorrectAnswerQuestionMap() {
        return correctAnswerQuestionMap;
    }
}
