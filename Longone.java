import java.util.*;

public class Longone {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        int max=0,count=0;
        for(int i=0;i<n;i++) {
            if(a[i]==1) {
                count++;
            }
            else {
                count=0;
            }
            if(count>max) {
                max=count;
            }
        }
        System.out.print(max);
    }
}