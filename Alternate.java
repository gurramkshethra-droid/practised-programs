import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Alternate {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++ ) {
            a[i]=s.nextInt();

        }
        for(int i=0;i<n/2;i++) {
            System.out.print(a[i]+" "+a[n-1-i]+" ");
        }
        if(n%2!=0) {
            System.out.print(a[n/2]);
        }
    }
}
