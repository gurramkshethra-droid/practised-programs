import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Compute {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a,b;
        long mul=1;
        a=sc.nextInt();
        b=sc.nextLong();
        if(b==0) {
            System.out.println(1);
            return;
        }
        for(long i=0;i<b;i++) {
            mul=mul*a;
        }
        System.out.println(mul);
    }
}
