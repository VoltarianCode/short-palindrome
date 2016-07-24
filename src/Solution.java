import java.io.*;
import java.util.*;

/**
 * Created by Illya on 16-07-24.
 */
public class Solution {
    /*public static int findPairs(int i, int j, char[] array, int length){
        int count = 0;
        for (int k = i; k < j - 1; k++ ){
            for (int m = j; m > k+1; m--){
                if (array[k] == array[m]){
                    count++;
                }
            }
        }
        return count;
    }
    */
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String s = in.nextLine();
        int length = s.length();
        int count = 0;
        char array[] = s.toCharArray();
        if (length < 4){
            System.out.println("0");
            return;
        }
        for (int i = 0; i < length-3; i++){
            for (int j = length-1; j > i+2; j--){
                if (array[i] == array[j]){
                    //count+=findPairs(i, j, array, length);
                    for (int k = i + 1; k < j ; k++ ){
                        for (int m = j - 1; m > k; m--){
                            if (array[k] == array[m]){
                                count++;
                            }
                        }
                    }
                }
            }

        }
        System.out.println(count%(1000000000 + 7));
    }
}
