import java.io.*;
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int temp=n;
        int t=n,r,count=0,sum=0;
        while(temp>0) {
            count++;
            temp/=10;
        }
        while(t>0) {
            r=t%10;
            sum+=Math.pow(r,count);
            t=t/10;
        }
        if(sum==n) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
