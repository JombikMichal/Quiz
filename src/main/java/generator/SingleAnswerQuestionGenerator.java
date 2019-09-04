package generator;

public class SingleAnswerQuestionGenerator {
    private String[] answers;
    private String correctAnswer;
    private String[] questions;
    private QuestionHolder questionHolder;

    public SingleAnswerQuestionGenerator() {
        this.questionHolder = new QuestionHolder();
    }

    public QuestionHolder getQuestionHolder() {
        return questionHolder;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }
}
