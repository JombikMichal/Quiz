package generateQuiz;

public class MultiAnswerQuestion extends AbstractQuestion {

    public MultiAnswerQuestion(int position, QuestionsHolder questionsHolder) {
        super(position,questionsHolder,MultiAnswerQuestion.class.getName());
    }
}
