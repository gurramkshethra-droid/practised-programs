import java.io.*;
import java.util.*;

public class Harsh {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int temp=n;
        int sum=0,r;
        while(temp!=0) {
            r=temp%10;
            sum+=r;
            temp=temp/10;
        }
        if(n%sum==0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
