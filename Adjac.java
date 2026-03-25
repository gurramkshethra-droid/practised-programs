import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Adjac {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        int flag=1;
        for(int i=0;i<n;i++) {
            if(a[i]==0 && a[i+1]==0) {
                flag=0;
                break;
            }
        }
        if(flag==0) {
            System.out.print("No");
        }
        else {
            System.out.print("Yes");
        }

    }
}
