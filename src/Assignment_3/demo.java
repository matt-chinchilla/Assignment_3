package Assignment_3;

public class demo {
    public static void main(String[] args) {
        String input1 = "()";
        String i2 = "()[]{}";
        String i3 = "(]";

        System.out.println(ValidityChecker.isValid(input1));
        System.out.println(ValidityChecker.isValid(i2));
        System.out.println(ValidityChecker.isValid(i3));
    }

}
