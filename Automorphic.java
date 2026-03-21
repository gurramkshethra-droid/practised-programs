import java.io.*;
import java.util.*;

public class Automorphic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int sq=n*n;
        int t=sq,r,rem;
        int temp=n,flag=1;
        while(temp>0) {
            r=temp%10;
            rem=t%10;
            if(rem!=r) {
                flag=0;
                break;
            }
            temp/=10;
            t/=10;
        }
        if(flag==1) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
