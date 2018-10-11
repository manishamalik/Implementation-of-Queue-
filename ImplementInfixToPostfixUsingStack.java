package revisionQueue;

import java.util.Stack;

public class ImplementInfixToPostfixUsingStack {
    public String convertInfixToPostfix(String str){
        String result = new String("");
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result= result+ch;
            }
            else if(ch=='(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while(!stack.isEmpty() && stack.peek()!='('){
                    result+=stack.pop();
                }
                if(stack.isEmpty() && stack.peek()!='('){
                   return "Invalid Expression";
                }
                else{
                    stack.pop();
                }
            }
            else {
                while (!stack.isEmpty() && prec(ch) <= prec(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            result +=stack.pop();
        }
        return result;
    }
    public static int prec(Character ch){
        switch (ch){
            case '+':
            case'-':
                return 1;
            case '*':
            case '/':
                return 2;
            case'^':
                return 3;
        }
        return -1;
    }
}
