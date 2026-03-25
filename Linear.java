import java.util.*;

public class Linear {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n,k;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        k=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        int flag=0;
        for(int i=0;i<n;i++) {
            if(a[i]==k) {
                flag=i;
                break;
            }
        }
        if(flag==0) {
            System.out.print(-1);
        }
        else {
            System.out.print(flag);
        }
    }
}