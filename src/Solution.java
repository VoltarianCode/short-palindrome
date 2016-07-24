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
        System.out.println(s);
    }
}
