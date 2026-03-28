import java.io.*;
import java.util.*;

public class Distribute {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int p=0,ne=0,z=0;
        Scanner s=new Scanner(System.in);
        int n;
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++) {
            if(a[i]>0) {
                p++;
            }
            else if(a[i]<0) {
                ne++;
            }
            else if(a[i]==0) {
                z++;
            }
        }
        System.out.print(z+" "+p+" "+ne);
    }
}