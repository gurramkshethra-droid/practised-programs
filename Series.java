import java.io.*;
import java.util.*;

public class Series {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n,a,d;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        d=s.nextInt();
        n=s.nextInt();
        for(int i=0;i<n;i++) {
            System.out.print(a+i*d+" ");
        }
    }
}
