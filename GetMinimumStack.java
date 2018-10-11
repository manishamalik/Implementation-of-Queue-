//  get minimum value using in O(1) time using stack
package revisionQueue;

import java.util.Stack;

public class GetMinimumStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int data){
        mainStack.push(data);
        if(minStack.empty() || minStack.peek()>data){
            minStack.push(data);
        }
    }
    public int pop(){
        if(mainStack.empty()){
            return Integer.MIN_VALUE;
        }
        int data= mainStack.pop();
        if(minStack.peek()==data){
            minStack.pop();
        }
        return data;
    }
    public int getMin(){
        return minStack.peek();
    }
    public int top(){
        return mainStack.peek();
    }
    public boolean isEmpty(){
        return mainStack.empty();
    }

}
