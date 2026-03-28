import java.io.*;
import java.util.*;

public class Main {

    public static void Diff_mat(String[] args) {
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
        int osum=0,esum=0;
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<m;j++) {
                if(i%2==0) {
                    esum+=a[i][j];
                }
                else {
                    osum+=a[i][j];
                }
            }
        }
        System.out.println(Math.abs(osum-esum));
    }
}
