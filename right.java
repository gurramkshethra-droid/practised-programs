import java.util.*;

public class right {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner s=new Scanner(System.in);
        int a,b,c;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(c*c==a*a+b*b) {
            System.out.println("Yes "+c);
        }
        else {
            System.out.println("No");
        }
    }
}