import java.io.*;
import java.util.*;

public class Mulmatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n1,m1;
        Scanner s=new Scanner(System.in);
        n1=s.nextInt();
        m1=s.nextInt();
        int a[][]=new int[n1][m1];
        for(int i=0;i<n1;i++) {
            for(int j=0;j<m1;j++) {
                a[i][j]=s.nextInt();
            }
        }
        int n2,m2;
        n2=s.nextInt();
        m2=s.nextInt();
        int b[][]=new int[n2][m2];
        for(int i=0;i<n2;i++) {
            for(int j=0;j<m2;j++) {
                b[i][j]=s.nextInt();
            }
        }

        if(m1==n2) {
            int c[][]=new int[n1][m2];
            for(int i=0;i<n1;i++) {
                for(int j=0;j<m2;j++) {
                    for(int k=0;k<m1;k++) {
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            for(int i=0;i<n1;i++) {
                for(int j=0;j<m2;j++) {
                    System.out.print(c[i][j]+" ");
                 }
                System.out.println();
            }

        }
        else {
            System.out.print(-1);
        }
    }
}
