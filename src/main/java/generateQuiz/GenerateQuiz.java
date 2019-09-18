package generateQuiz;

import java.util.ArrayList;
import java.util.List;

public class GenerateQuiz {
    //GenerateQuiz bude obsahovat list objekov otazok ktory bude vracat
    // - pole vygenerovanych otazok (cisla)

    private int [] randomedQuestionNumbers;
    private List<AbstractQuestion> questionList;
    private RandomNumberGenerator randomNumberGenerator;
    private QuestionsHolder questionsHolder;
    public static int winCount;

    public GenerateQuiz() {
        this.questionsHolder = new QuestionsHolder();
        this.questionList = new ArrayList<>();
    }

    private int[] getRandomedQuestionNumbers(int questionCount,int size) {
        this.randomNumberGenerator = new RandomNumberGenerator(questionCount,size);
        randomedQuestionNumbers = randomNumberGenerator.getNumbersArray();
        return randomedQuestionNumbers;
    }

    public List<AbstractQuestion> getQuestionList() {
        int singleAnswer[] = getRandomedQuestionNumbers(3,questionsHolder.getCorrectAnswerQuestionSingleMap().size());
        int multiAnswer[] = getRandomedQuestionNumbers(2,questionsHolder.getCorrectAnswerQuestionMultiMap().size());
        for (int i = 0; i < singleAnswer.length; i++){
            questionList.add(new SingleAnswerQuestion(singleAnswer[i],questionsHolder));
        }
        for (int i = 0; i < multiAnswer.length; i++){
            questionList.add(new MultiAnswerQuestion(multiAnswer[i],questionsHolder));
        }
        return questionList;
    }

}
