import java.io.*;
import java.util.*;

public class Column_sum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        int sum=0;
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<m;i++) {
            sum=0;
            for(int j=0;j<n;j++) {
                sum+=a[j][i];
            }
            System.out.println(sum);
        }
    
    }
}
