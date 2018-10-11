package revisionQueue;

import java.util.Scanner;
import java.util.Stack;

public class BalancingOfSymbol {

    public boolean isBalance() {
        Stack<Character> stack =new Stack<Character>();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string=");
        String s= scanner.next();
        if(s==null|| s.length()==0 ){
            return true;
        }
        else {
            for(int i= 0 ; i<s.length(); i++){
                if(s.charAt(i)==']'){
                    if(!stack.isEmpty() && stack.peek()=='[') {
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(s.charAt(i)=='}'){
                    if(!stack.isEmpty() && stack.peek()=='{') {
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(s.charAt(i)==')'){
                    if(!stack.isEmpty() && stack.peek()=='(') {
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(s.charAt(i)=='{'|| s.charAt(i)=='(' || s.charAt(i)=='['){
                    stack.push(s.charAt(i));
                }
            }
            if(stack.isEmpty()){
                return true;
            }
            else{
                return false;
            }
        }
    }
//    public boolean isMachingPair(Character c,Character c1){
//        if (c.equals(c1))
//            return true;
//        else
//            return false;
//
//    }
}
