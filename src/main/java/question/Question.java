package question;

import question.Answer;

import java.util.List;

public class Question {

    private String question;
    private List<Answer> answers;
    private String type;

    public Question(String question, List<Answer> answers) {
        this.question = question;
        this.answers = answers;
    }

    private long getCorrectAnsCount(){
        return answers.stream().filter(answer -> answer.isCorrect()).count();
    }

    public boolean evalute(String... indexes){
        int correctAnsCount = 0;
        for (int i =0; i < indexes.length; i++){
            if(answers.get(Integer.parseInt(indexes[i]) - 1).isCorrect()){
                correctAnsCount++;
            }
        }
        return correctAnsCount == getCorrectAnsCount();
    }

    private void setTypeQuestion(){
        this.type = " (Question with single answer)";
        int count = 0;
        for(Answer answer : answers){
            if (answer.isCorrect()){
                count++;
                if (count > 1){
                    this.type = " (Question with multiple answers)";
                    break;
                }
            }
        }
    }

    public void display(){
        setTypeQuestion();
        System.out.println(this.question + this.type);
        for (int i = 0; i < answers.size(); i++){
            System.out.print(i+1 +  ". ");
            System.out.println(answers.get(i).getValue());
        }
    }

    public String getQuestion() {
        return question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}
