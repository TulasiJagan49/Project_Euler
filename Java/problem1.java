import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long n1 = (n - 1) / 3;
            n1 = 3 * (n1 * (n1 + 1) / 2);
            long n2 = (n - 1) / 5;
            n2 = 5 * (n2 * (n2 + 1) / 2);
            long n3 = (n - 1) / 15;
            n3 = 15 * (n3 * (n3 + 1) / 2);
            long sum = n1 + n2 - n3;
            System.out.println(sum);
          
        }
    }
}