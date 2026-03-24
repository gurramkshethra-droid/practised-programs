import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Dummy {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int r,rem=0;
        int sign=1;
        if(n<0) {
            sign=-1;
            n=-n;
        }
        while(n>0) {
            r=n%10;
            rem=(rem*10)+r;
            n=n/10;
        }
        System.out.print(rem*sign);
    }
}
