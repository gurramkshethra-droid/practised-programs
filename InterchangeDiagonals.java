import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [][]a= new int [n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            int temp=a[i][i];
            a[i][i]=a[i][n-i-1];
            a[i][n-i-1]=temp;
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


    }
}
