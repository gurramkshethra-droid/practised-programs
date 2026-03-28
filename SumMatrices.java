import java.io.*;
import java.util.*;

public class SumMatrices {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        int c[][]=new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                a[i][j]=s.nextInt();
            } 
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                b[i][j]=s.nextInt();
            } 
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                c[i][j]=a[i][j]+b[i][j];
            } 
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(c[i][j]+" ");
            } 
            System.out.println();
        }
    }
}
