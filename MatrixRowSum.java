import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int i,j,m,n;
        
        Scanner sc= new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int[] sum= new int[n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                sum[j]+=sc.nextInt();
            }
        }
        for(j=0;j<n;j++){
        System.out.println(sum[j]);
        }
    
    }
}
