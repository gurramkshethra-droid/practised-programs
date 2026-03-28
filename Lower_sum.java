import java.io.*;
import java.util.*;

public class Lower_sum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                a[i][j]=s.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i>=j) {
                    sum+=a[i][j];
                }
            }
        }
        System.out.print(sum);
    }
}
