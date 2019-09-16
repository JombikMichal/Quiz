package generateQuiz;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeHolder {
    private Map<String,String> type;
    private String typeName;

    public ClassTypeHolder() {

        type = new HashMap<>(){{
            put(SingleAnswerQuestion.class.getName()," (Question with single answer)");
            put(""," (Question with multiple answers)");
        }};
    }

    public String getTypeName(String className) {
        if(type.containsKey(className))
        {
            return type.get(className);
        }
        return null;
    }

}
