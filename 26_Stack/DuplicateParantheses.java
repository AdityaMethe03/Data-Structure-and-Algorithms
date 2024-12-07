import java.util.*;

public class DuplicateParantheses {

    public static boolean isDuplicate(String str) { //O(n)
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '(') { //doesn't need isEmpty cause string will always be valid
                     s.pop();
                     count++;   
                }
                if(count < 1) {
                    return true; //duplicate
                } else {
                    s.pop(); //opening pair
                }
            } else {
                //opening, operator, operands
                s.push(ch);
            }
        }

        return false;
    }
    

    public static void main(String[] args) {
        //Valid String
        String str1 = "((a+b))"; //true
        String str2 = "(a-b)"; //false
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
