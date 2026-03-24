import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Div {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                System.out.print(i+" ");
            }
        }
    }
}
