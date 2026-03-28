import java.util.*;

public class Segregate {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++) {
            if(a[i]>=0) {
                System.out.print(a[i]+" ");
            }
        }
        for(int i=0;i<n;i++) 
        {
            if(a[i]<0) {
                System.out.print(a[i]+" ");
            }
        }
    }
}