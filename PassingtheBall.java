import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            
            int count = 1; // student 1 already has the ball
            
            for(int i = 0; i < n; i++){
                if(s.charAt(i) == 'R'){
                    count++;
                } else {
                    break;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}
