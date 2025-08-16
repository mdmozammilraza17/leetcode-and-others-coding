import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stringStack = new Stack<>();
        String s = "()[]{}";

        for (int i=0; i<s.length(); i++)
        {
            stringStack.push(s.charAt(i));

            if (stringStack.contains('(') || stringStack.contains(')') ||
            stringStack.contains('{') || stringStack.contains('}') ||
                    stringStack.contains('[') || stringStack.contains(']'))
            {

            }
        }




    }
}