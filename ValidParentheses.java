import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;
import java.math.BigInteger;

public class ValidParentheses {

    public static void main(String [] args) {
        System.out.printf("Hello Valid Parentheses Solution%n");
        if (args != null && args.length == 1 && args[0].toLowerCase().equals("-usage")) {
            System.out.printf("java ValidParentheses%n");
            return;
        }

//        String input = "(){}";
//        String input = "(){}(";
//        String input = "[(){}]";
//        String input = "[{(()){}}]";
//        String input = "[(])";
//        String input = "{[1,2,3](a,b,c),?}";
        String input = "())))";
//        String input = "(((()";
//        String input = "}(())";
        
        ValidParentheses validParentheses = new ValidParentheses(input);

        boolean result = validParentheses.solution();

        if (result) {

            System.out.printf("the parentheses %s are valid%n", input);

        } else {

            System.out.printf("the parentheses %s are invalid%n", input);

        }

    }

    private String input;

    public ValidParentheses(String input) {

        this.input = input;

    }

    public boolean solution() {

        // Initialize a stack
        Stack<Character> stack = new Stack<>();

        char [] parentheses = input.toCharArray();

        for (int i = 0; i < parentheses.length; i++) {

            char nextParenthesis = parentheses[i];

            boolean isOpen = nextParenthesis == '(' || nextParenthesis == '[' || nextParenthesis == '{';

            if (isOpen) {

                stack.push(Character.valueOf(nextParenthesis));

            }

            boolean isClose = nextParenthesis == ')' || nextParenthesis == ']' || nextParenthesis == '}';

            if (isClose) {

                if (stack.empty()) return false;

                // figure out if this has a matching open bracket
                boolean isPoppable =
                    stack.peek().equals(Character.valueOf('(' )) && nextParenthesis == ')' ||
                    stack.peek().equals(Character.valueOf('[' )) && nextParenthesis == ']' ||
                    stack.peek().equals(Character.valueOf('{' )) && nextParenthesis == '}';

                if (isPoppable) {

                    stack.pop();

                }
            }

        }

        return stack.empty();
    }

}
