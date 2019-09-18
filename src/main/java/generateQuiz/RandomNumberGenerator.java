package generateQuiz;

import java.util.Random;

public class RandomNumberGenerator {

    private int numCount;
    private int numRange;

    public RandomNumberGenerator(int numCount, int numRange) {
        this.numCount = numCount;
        this.numRange = numRange;
    }

    public boolean contains(final int[] array, final int v) {

        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }

        return result;
    }

    public int[] getNumbersArray(){
        int[] res = new int[numCount];
        Random random = new Random();
        for (int i = 0; i < res.length;){
            int j = random.nextInt(numRange);
            if(!contains(res,j)){
                res[i] = j;
                i++;
            }
        }
        return res;
    }
}
