import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Dup {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)  {
            for(int j=i+1;j<n;j++) {
                if(a[i]==a[j]) {
                    System.out.print(a[i]);
                    return;
                }
            }
        }
    }
}
