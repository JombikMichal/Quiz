package generateQuiz;

import java.util.Map;

public abstract class AbstractQuestion {
    private String question;
    private String answer;
    private final String type;
    private final int position;
    private Map<String,String> possibleAnswers;
    private QuestionsHolder questionsHolder;
    private ClassTypeHolder classTypeHolder = new ClassTypeHolder();

    public AbstractQuestion(int position, QuestionsHolder questionsHolder,String type) {
        this.position = position;
        this.type = classTypeHolder.getTypeName(type);
        this.questionsHolder = questionsHolder;
        this.question = questionsHolder.getQuestions(this.position,this);
        this.possibleAnswers = questionsHolder.getQuestionWithPossibleAnswers(this.question);
        this.answer = questionsHolder.getCorrectAnswer(this.question,this);
    }

    public String getAnswer() {
        return answer;
    }

    public QuestionsHolder getQuestionsHolder() {
        return questionsHolder;
    }

    public void display(){
        if (type != null || !type.isEmpty()){
            this.question += type;
        }
        System.out.println(this.question);
        for (String key: this.possibleAnswers.keySet()){
            System.out.print(key + ". ");
            System.out.println(possibleAnswers.get(key));
        }
    }

    public void evaluation(String input){
        if (answer.equals(input.trim())){
            int a = GenerateQuiz.winCount++;
            System.out.println(a);
        }
    }
}
