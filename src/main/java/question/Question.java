package question;

import question.Answer;

import java.util.List;

public class Question {
    private String question;
    private List<Answer> answers;

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

    public void display(){
        System.out.println(this.question);
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
