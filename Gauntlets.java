import java.util.*;

public class Gauntlets {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[1001];
        for(int i=0;i<n;i++) {
            int x=s.nextInt();
            a[x]++;
        }
        int pairs=0;
        for(int i=0;i<1001;i++) {
            pairs+=a[i]/2;
        }
        System.out.print(pairs);
    }
}