import java.io.*;
import java.util.*;

public class Primee {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int count=0;
        if(n<=1) {
            System.out.println("No");
            return ;
        }
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                count++;
            }
        }
        if(count==0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
