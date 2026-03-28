import java.util.*;

public class Per {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a+b>c && b+c>a && c+a>b) {
            System.out.println(a+b+c);
        }
        else {
            System.out.println(-1);
        }
    }
}