import java.io.*;
import java.util.*;

public class Automorphic {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int sq=n*n;
        int t=sq,r,rem;
        int temp=n,flag=1;
        while(temp>0) {
            r=temp%10;
            rem=t%10;
            if(rem!=r) {
                flag=0;
                break;
            }
            temp/=10;
            t/=10;
        }
        if(flag==1) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
