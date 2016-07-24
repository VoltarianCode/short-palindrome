import java.io.*;
import java.util.*;

/**
 * Created by Illya on 16-07-24.
 */
public class Solution {
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
            for (int j = i+1; j <length-2; j++){
                for (int k = j+1; k<length-1; k++){
                    for (int m = k + 1; m < length; m++){
                        if(array[i]==array[m] && array[j] == array[k]){
                            count++;
                        }
                    }
                }
            }

        }
        System.out.println(count%(1000000000 + 7));
    }
}
