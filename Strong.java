import java.io.*;
import java.util.*;

public class Strong {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int temp=n,r;
        int fact,sum=0;
        while(temp>0) {
            r=temp%10;
            fact=1;
            for(int i=r;i>=1;i--) {
                fact*=i;
            }
            sum+=fact;
            temp=temp/10;
        }
        if(sum==n) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
