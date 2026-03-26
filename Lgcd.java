import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Lgcd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int m,n;
        Scanner s=new Scanner(System.in);
        m=s.nextInt();
        n=s.nextInt();
        int gcd1=gcd(m,n);
        int lcm=(m*n)/gcd1;
        System.out.print("LCM is "+lcm+", GCD is "+gcd1);
    }
    public static int gcd(int m,int n) {
        int r;
        while(n!=0) {
            r=m%n;
            m=n;
            n=r;
        }
        return m;
    }
}
