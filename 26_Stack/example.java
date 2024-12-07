import java.util.*;

public class example {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(') {
                s.push(ch);
            } else if(ch == ')') {
                if(s.isEmpty()) {
                    return false;
                }
                s.pop();
            }
        }


        return s.isEmpty();

    }

//----------------------------------------------------------------------------------------

    public static String postfix(String str) {
        Stack<Character> s = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='(') {
                s.push(ch);
            } else if(ch==')') {
                while(!s.isEmpty() && s.peek()!='(') {
                    postfix.append(s.pop());
                }
                if (!s.isEmpty() && s.peek() != '(') {
                    return "Invalid Expression"; // invalid expression
                } else {
                    s.pop();
                }
            } else if(precedance(ch) > 0) {
                while(!s.isEmpty() && precedance(ch)<=precedance(s.peek())) {
                    postfix.append(s.pop());
                }
                s.push(ch);
            } else {
                postfix.append(ch); //operand
            }
        }

        // pop all the operators from the stack
        while (!s.isEmpty()) {
            if (s.peek() == '('){
                return "Invalid Expression"; // invalid expression
            } 
            postfix.append(s.pop());
        }
        
        return postfix.toString();
    }

    public static int precedance(char ch) {
        if(ch == '^') {
            return 3;
        } else if(ch=='*' || ch=='/') {
            return 2;
        } else if(ch=='+' || ch=='-') {
            return 1;
        }
        return -1;
    }

//----------------------------------------------------------------------------------------

    public static void main(String[] args) {
        // System.out.println(isValid("(())()"));
        // System.out.println(isValid("())()"));

        System.out.println(postfix("a+b*(c/d-e^f)+g"));
        System.out.println(postfix("a+b*((c/d-e^f)+g"));
    }
}
