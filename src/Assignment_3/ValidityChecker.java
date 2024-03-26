package Assignment_3;

import java.util.Stack; // Importing stack Class for push and pop operations that are pre-defined

public class ValidityChecker {
    public static boolean isValid (String s){
        // Initialize stack
        Stack<Character> stack = new Stack<>(); // Character Class converts a primitive "char" to an object "Character" -> Makes for easier operations (has predefined methods like push, pop, isEmpty, etc.) 
                                                // The angle brackets "<>" are used to insert a datatype if a method is not defined with a datatype (like Integer, Character, etc.)
        // Iterate through each character of the string
        for (char c: s.toCharArray()){ // toCharArray() method converts the string to a character array

            //If opening bracket -> push to stack
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else {
                // implement case if the stack is empty
                if (stack.isEmpty())
                    return false;

                // Check if the current type of closing bracket matches the opening one at the top of the stack
                char top = stack.pop(); // Removes and returns the top of the stack
                if (c == ')' && top != '('){
                    return false;
                }
                if (c == '}' && top != '{'){
                    return false;
                }
                if (c == ']' && top != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty(); // If the stack is empty, then the string is valid
    }
}
