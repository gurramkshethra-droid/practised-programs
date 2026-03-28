import java.io.*;
import java.util.*;

public class Oppmatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
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
            int sum=0;
            for(int j=0;j<m;j++) {
                sum+=a[i][j];
            }
            for(int j=0;j<m;j++) {
                sum+=b[n-1-i][j];
            }
            System.out.println(sum);
        }
    }
}
