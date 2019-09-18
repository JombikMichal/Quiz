package generateQuiz;

public class SingleAnswerQuestion extends AbstractQuestion {

    public SingleAnswerQuestion(int position, QuestionsHolder questionsHolder) {
        super(position,questionsHolder,SingleAnswerQuestion.class.getName());
    }
}
