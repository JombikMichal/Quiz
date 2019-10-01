package question;

import helper.Helper;

import java.util.ArrayList;
import java.util.List;

public class QuizQuestions {
    private List<Question> questions;
    private List<Integer> indexesSingle;
    private List<Integer> indexesMulti;
    private List<Question> pickedQuestions;

    public QuizQuestions(List<Question> questions) {
        this.questions = questions;
        this.indexesSingle = new ArrayList<>();
        this.indexesMulti = new ArrayList<>();
        this.pickedQuestions = new ArrayList<>();
        getQuestions();
    }

    public List<Question> getPickedQuestions() {
        return pickedQuestions;
    }

    private void getIndexes(){
        for (int i = 0; i < this.questions.size(); i++){
            if (this.questions.get(i).getType().equalsIgnoreCase("single")){
                this.indexesSingle.add(i);
            }else {
                this.indexesMulti.add(i);
            }
        }
    }

    private void getQuestions(){
       getIndexes();
       int [] single =  Helper.getNumbersArray(3,this.indexesSingle.size());
       int [] multi =  Helper.getNumbersArray(2,this.indexesMulti.size());

       for (int i =0; i < single.length; i++){
           this.pickedQuestions.add(this.questions.get(this.indexesSingle.get(single[i])));
       }
        for (int i =0; i < multi.length; i++){
            this.pickedQuestions.add(this.questions.get(this.indexesMulti.get(multi[i])));
        }
    }

}
