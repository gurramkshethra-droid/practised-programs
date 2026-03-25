import java.util.*;

public class Max {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        int max=a[0];
        for(int i=1;i<n;i++) {
            if(a[i]>max) {
                max=a[i];
            }
        }
        System.out.print(max);
    }
}