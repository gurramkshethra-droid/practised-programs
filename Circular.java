import java.io.*;
import java.util.*;

public class Circular {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n,k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++) {
            System.out.print(a[(k+i)%n]+" ");
        }
    }
}