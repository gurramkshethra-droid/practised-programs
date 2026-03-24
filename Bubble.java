import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Bubble {

    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        int temp;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-1-i;j++) {
                if(a[j]>a[j+1]) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            for(int k=0;k<n;k++) {
            System.out.print(a[k]+" ");
        }
        System.out.println();
        }
    }
}
