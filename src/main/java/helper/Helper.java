package helper;

import java.util.Arrays;
import java.util.Random;

public class Helper {


    private static boolean contains(final int[] array, final int v) {
        boolean result = false;

        for(int i : array){
            if(i == v){
                result = true;
                break;
            }
        }
        return result;
    }

    public static int[] getNumbersArray(int numCount, int numRange){
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

    public static String[] singleChars(String s) {
        return s.split("(?!^)");
    }

    public static String sortString(String inputString) {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

}
