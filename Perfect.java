import java.io.*;
import java.util.*;

public class Perfect {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int sum=0;
        for(int i=1;i<n;i++) {
            if(n%i==0) {
                sum+=i;
            }
        }
        if(sum==n) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
