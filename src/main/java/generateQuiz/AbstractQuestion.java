package generateQuiz;

import java.util.Map;

public abstract class AbstractQuestion {
    private String question;
    private String answer;
    private Map<String,String> possibleAnswers;
    private int position;
    private QuestionsHolder questionsHolder;

    public AbstractQuestion(int position, QuestionsHolder questionsHolder) {
        this.position = position;
        this.questionsHolder = questionsHolder;
        this.question = questionsHolder.getQuestions(this.position);
        this.possibleAnswers = questionsHolder.getQuestionWithPossibleAnswers(this.question);
        this.answer = questionsHolder.getCorrectAnswer(this.question);
    }

    public String getAnswer() {
        return answer;
    }

    public void display(){
        System.out.println(this.question);
        for (String key: this.possibleAnswers.keySet()){
            System.out.print(key + ". ");
            System.out.println(possibleAnswers.get(key));
        }
    }

    public void evaluation(String input){
        if (answer.equals(input)){
            int a = GenerateQuiz.winCount++;
            System.out.println(a);
        }
    }
}
