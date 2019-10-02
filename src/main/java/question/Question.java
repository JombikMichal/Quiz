package question;
import helper.Helper;
import question_list.QuestionsHolder;

import java.util.List;

public class Question {

    private String question;
    private List<Answer> answers;
    private String text;
    private String type;

    public Question(String question, List<Answer> answers) {
        this.question = question;
        this.answers = answers;
        setTypeQuestion();
    }

    private long getCorrectAnsCount(){
        return answers.stream().filter(answer -> answer.isCorrect()).count();
    }

    public boolean evalute(String... indexes){
        int correctAnsCount = 0;
        for (int i =0; i < indexes.length; i++){
            if(answers.get(Integer.parseInt(indexes[i])).isCorrect()){
                correctAnsCount++;
            }
        }
        return correctAnsCount == getCorrectAnsCount();
    }


    private void setTypeQuestion(){
        this.text = " (Question with single answer)";
        this.type = "single";
        if(this.getCorrectAnsCount() > 1){
            this.text = " (Question with multiple answers - separate your answer with a comma, i.e.: a,b,c)";
            this.type = "multi";
        }
    }

    public void display(){
        System.out.println(this.question + this.text);
        for (int i = 0; i < answers.size(); i++){
            System.out.print(Helper.getAlphabet()[i] +  ". ");
            System.out.println(answers.get(i).getValue());
        }
    }

    public String getQuestion() {
        return question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public String getType() {
        return type;
    }
}
