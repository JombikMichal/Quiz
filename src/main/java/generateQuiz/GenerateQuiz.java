package generateQuiz;

import java.util.ArrayList;
import java.util.List;

public class GenerateQuiz {
    //GenerateQuiz bude obsahovat list objekov otazok ktory bude vracat
    // - pole vygenerovanych otazok (cisla)

    private int [] randomedQuestionNumbers;
    private List<SingleAnswerQuestion> questionList;
    private RandomNumberGenerator randomNumberGenerator;
    private QuestionsHolder questionsHolder;
    public static int winCount;



    public GenerateQuiz() {
        this.questionsHolder = new QuestionsHolder();
        this.questionList = new ArrayList<>();
        getQuestionList();
    }

    private int[] getRandomedQuestionNumbers() {
        this.randomNumberGenerator = new RandomNumberGenerator(3,questionsHolder.getCorrectAnswerQuestionMap().size());
        randomedQuestionNumbers = randomNumberGenerator.getNumbersArray();
        return randomedQuestionNumbers;
    }

    public List<SingleAnswerQuestion> getQuestionList() {
        getRandomedQuestionNumbers();
        for (int i = 0; i < randomedQuestionNumbers.length; i++){
            questionList.add(new SingleAnswerQuestion(randomedQuestionNumbers[i],questionsHolder));
        }
        return questionList;
    }

}
