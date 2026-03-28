import java.util.*;

public class Rec {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();

        }
        rev(a,n);
    }
    public static void rev(int a[],int n) {
        if(n==0)return;
        System.out.print(a[n-1]+" ");
        rev(a,n-1);
    }
}