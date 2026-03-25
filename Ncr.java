import java.io.*;
import java.util.*;

public class Ncr {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n,r;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        r=s.nextInt();
        int ans=fact(n)/(fact(n-r)*fact(r));
        System.out.print(ans);
    }
    public static int fact(int n) {
        int fah=1;
        for(int i=n;i>=1;i--) {
            fah*=i;
        }
        return fah;
    }
}