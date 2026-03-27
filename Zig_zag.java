import java.io.*;
import java.util.*;

public class Main {

    public static void Zig_zag(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                a[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<n;i++) {
            if(i%2==0) {
                for(int j=0;j<m;j++) {
                    System.out.print(a[i][j]+" ");
                }
            }
            else {
                for(int j=m-1;j>=0;j--) {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}
