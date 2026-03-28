import java.util.*;
import java.util.regex.*;

class MyRegex {
    String pattern = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\\.){3}"
                   + "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})$";
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        
        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(input.matches(myRegex.pattern));
        }
        
        sc.close();
    }
}
