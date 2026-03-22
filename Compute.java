import java.io.*;
import java.util.*;

public class Compute {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner s=new Scanner(System.in);
        long a,b;
        long mul=1;
        a=s.nextInt();
        b=s.nextLong();
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
