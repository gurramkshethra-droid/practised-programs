import java.io.*;
import java.util.*;

public class Sparse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        int a[][]=new int[n][m];
        int hf=(n*m)/2,count=0;
        for(int i=0;i<n;i++) 
        {
            for(int j=0;j<m;j++) {
                a[i][j]=s.nextInt();
                if(a[i][j]==0) {
                    count++;
                }
            }
        }
        if(count>hf) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
