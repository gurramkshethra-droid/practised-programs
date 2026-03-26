import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                BigDecimal bd1 = new BigDecimal(a);
                BigDecimal bd2 = new BigDecimal(b);
                return bd2.compareTo(bd1);
            }
        });

        for (String val : s) {
            System.out.println(val);
        }

        sc.close();
    }
}
