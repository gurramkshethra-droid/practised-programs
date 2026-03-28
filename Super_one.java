import java.io.*;
import java.util.*;

public class Super_one {

    public static void main(String[] args) {
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
        boolean found=false;
        for(int i=1;i<n-1;i++) {
            for(int j=1;j<m-1;j++){
                if(a[i][j]==1) {
                    if(a[i-1][j-1]==0 && a[i-1][j]==0 && a[i-1][j+1]==0 && a[i][j-1]==0 && a[i][j+1]==0 && a[i+1][j-1]==0 && a[i+1][j]==0 && a[i+1][j+1]==0) {
                        found=true;
                        break;
                    }
                }
            }
            if(found) {
                break;
            }
        }
        if(found) {
            System.out.print("Yes");

        }
        else {
            System.out.print("No");
        }
    }
}
