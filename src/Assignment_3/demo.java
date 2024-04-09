package Assignment_3;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Start time
        long startTime = System.currentTimeMillis();
        long st = System.nanoTime();

        // Generate and validate random parentheses string
        System.out.println("length to be tested: ");
        int length = sc.nextInt();  // Specify length of randomized string
        
        String randomString = RandomStringGenerator.generateRandomString(length);
        System.out.println("Randomized parentheses string: " + randomString);
        System.out.println(ValidityChecker.isValid(randomString));
        
        // User enters a string of parentheses to validate
        System.out.println("Please enter a string:");
        String word = sc.next();
        System.out.println(ValidityChecker.isValid(word));
        
        // End times
        long endTime = System.currentTimeMillis();
        long et = System.nanoTime();
        
        long totalTime = endTime - startTime;
        long tt = et - st;
        
        // Print times
        System.out.println(totalTime + " milliseconds");
        System.out.println(tt + " nano");
        
        sc.close();
    }
}
