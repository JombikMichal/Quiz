package generator;

import java.util.Calendar;
import java.util.Map;

public interface QuizGenerator {
    Map<String,String> generateQuestion();
    Map<Character, String> getAnswers(String answer);
}
