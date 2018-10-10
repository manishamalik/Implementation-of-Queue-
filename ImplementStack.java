package revisionQueue;

public class ImplementStack {
    private int array[];
    private int top;
    public static final int Capacity =10;

    public ImplementStack(){
        array= new int[Capacity];
        top =-1;
    }
    public ImplementStack(int cap){
        array= new int[cap];
        top =-1;
    }

    public int sizeOfStack(){
        return top+1;
    }
    public boolean isFull(){
        if(top+1==Capacity){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top<0){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(int data) throws Exception {
        if(sizeOfStack()==Capacity){
            throw new Exception("Stack is full");
        }
        else {
            array[++top] = data;
        }
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is Empty");
        }
        int data = array[top];
        array[top--]= Integer.MIN_VALUE;
        return data;
    }
    public int top()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return array[top];
    }

    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Stack=");
            for(int i=0; i<sizeOfStack();i++){
                System.out.println(array[i]);
            }
        }
    }

}
