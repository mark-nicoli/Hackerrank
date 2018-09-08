import java.util.Scanner;
public class javaStack
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext())
        {
            System.out.println(isBalanced(scan.next()));
        }
    }

    static boolean isBalanced(String parentheses) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < parentheses.length(); i++) {
        char character = parentheses.charAt(i);
        if (character == '(' || character == '[' || character == '{') stack.push(character);
        else if (stack.empty()) return false;
        else
        {
            char top = stack.pop();
            if ((top == '(' && character != ')') || (top == '[' && character != ']') || (top == '{' && character != '}')) return false;
        }
    }
    return stack.empty();
    }
}
