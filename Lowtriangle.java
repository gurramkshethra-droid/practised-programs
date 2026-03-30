import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int m,n,i,j;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int value;
        int sum=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                value=sc.nextInt();
                if(i>=j){
                    sum+=value;
                }
            }
        }
        System.out.println(sum);
    }
}
