import java.util.*;

public class Binary {

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
        int flag=-1,low=0,high=n-1;
        while(low<=high) {
            int mid=(low+high)/2;
            System.out.println(low+" "+high+" "+mid);
            if(a[mid]==k) {
                flag=1;
                break;
            }
            else if(a[mid]<k) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        if(flag==1) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
    }
}