import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String s = sc.next();
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } 
                else {
                    if (stack.isEmpty()) {
                        isBalanced = false;
                        break;
                    }
                    
                    char top = stack.pop();

                    if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                        isBalanced = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                isBalanced = false;
            }

            System.out.println(isBalanced);
        }

        sc.close();
    }
}
