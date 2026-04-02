import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main {
    public static int myAtoi(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        long result = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE / 10) || 
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return (int)(result * sign);
    }

    public static void main(String[] args) {
        String s = " -042";
        System.out.println(myAtoi(s));
    }
}
