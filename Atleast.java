import java.util.*;

public class Atleast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        int prev=-1;
        for(int i=0;i<n;i++) {
            if(a[i]==1) {
                if(prev!=-1 && (i-prev-1)<m) {
                    System.out.print("false");
                    return;
                }
                prev=i;
            }
        }
        System.out.print("true");
    }
}