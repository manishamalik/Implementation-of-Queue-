package revisionQueue;

import java.util.Scanner;
import java.util.Stack;

public class balancingOfSymbol {

    public static boolean main(String[] args) {
        Stack<Character> stack =new Stack<Character>();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a string=");
        String s= scanner.next();
        if(s==null|| s.length()==0 ){
            return true;
        }
        else {
            char c,c1;
            for(int i= 0 ; i<s.length(); i++){
                c= s.charAt(i);
                if(c=='}'|| c==')' || c==']'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    c1= stack.pop();
                    if (c!=c1){
                        return false;
                    }
                }
                else if(c=='{'|| c=='(' || c=='['){
                    stack.push(c);
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
}
