package Class_Test;

import java.util.Stack;

public class Balanced_String {
    static  boolean matches(char open,char close){
        return(open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');

    }

    public static void main(String[] args) {
        String str="[({})]";
        if (isBalanced(str)) System.out.println("Balanced");
    }
    static boolean isBalanced(String s){
        Stack<Character>stack=new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='('||c=='['|| c=='{'){
                stack.push(c);
            } else if (c==')'||c==']'|| c=='}') {
                if (stack.isEmpty())return false;
                char top=stack.pop();
                if (!matches(top,c))return false;
            }
        }
        return stack.isEmpty();
    }
}
