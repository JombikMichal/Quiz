package generateQuiz;

import java.util.Map;

public class SingleAnswerQuestion {
    private String question;
    private String answer;
    private Map<String,String> possibleAnswers;
    private int position;
    private QuestionsHolder questionsHolder;

    public SingleAnswerQuestion(int position, QuestionsHolder questionsHolder) {
        this.position = position;
        this.questionsHolder = questionsHolder;
        this.question = questionsHolder.getQuestions(this.position);
        this.possibleAnswers = questionsHolder.getQuestionWithPossibleAnswers(this.question);
        this.answer = questionsHolder.getCorrectAnswer(this.question);
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
            GenerateQuiz.winCount++;
        }
    }

    public String getQuestion() {
        return question;
    }

    public Map<String, String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public String getAnswer() {
        return answer;
    }
}
