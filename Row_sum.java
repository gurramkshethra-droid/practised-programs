import java.io.*;
import java.util.*;

public class Row_sum {

    public static void main(String[] args) {
        int n,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=s.nextInt();
        int sum;
        for(int i=0;i<n;i++) {
            sum=0;
            for(int j=0;j<m;j++) {
                sum+=s.nextInt();
            }
            System.out.println(sum);
        }
    }
}
