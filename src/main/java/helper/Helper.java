package helper;
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
        return s.split(",\\s*");
    }

    public static String[] sortString(String inputString) {
        String result[] = new String[singleChars(inputString).length];
        for (int i = 0; i < singleChars(inputString).length; i++){
            result[i] = String.valueOf(getAlphaPosition(singleChars(inputString)[i].charAt(0)));
        }
        return result;
    }

    public static char[] getAlphabet(){
        char[] alpha = new char[26];
        for(int i = 0; i < 26; i++){
            alpha[i] = (char)(97 + i);
        }
        return alpha;
    }

    public static int getAlphaPosition(char alpha){
        int result = 0;
        for (int i = 0; i < getAlphabet().length; i++){
            if(getAlphabet()[i] == alpha){
                result = i;
            }
        }
        return result;
    }

}
