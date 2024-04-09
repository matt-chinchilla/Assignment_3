package Assignment_3;
import java.util.Random;
import java.util.Stack;

public class RandomStringGenerator {
    public static String generateRandomString(int length) {
        Stack<Character> stack = new Stack<>();
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < length; i++) {
            if (stack.isEmpty() || rand.nextBoolean()) {
                stack.push('(');
                sb.append('(');
            } else {
                stack.pop();
                sb.append(')');
            }
            if (stack.isEmpty() || rand.nextBoolean()) {
                stack.push('{');
                sb.append('{');
            } else {
                stack.pop();
                sb.append('}');
            }
            if (stack.isEmpty() || rand.nextBoolean()) {
                stack.push('[');
                sb.append('[');
            } else {
                stack.pop();
                sb.append(']');
            }
        }
        
        return sb.toString();
    }
}