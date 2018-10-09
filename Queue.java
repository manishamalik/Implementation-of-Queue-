package revisionQueue;

public class Queue {
    private static final int Capacity= 10;
    private int [] array;
    private int size, front, rear;

    public Queue(){
        array= new int[Capacity];
        front=0;
        rear=0;
        size=0;
    }
    public Queue(int cap){
        array= new int[cap];
        front=0;
        rear=0;
        size=0;
    }

    public void enQueue(int data) throws Exception{
        if(size==Capacity) {
            throw new Exception("Queue is full");
        }
        else{
            size++;
            array[rear]= data;
            rear= (rear+1)%Capacity;
        }
    }
    public int deQueue() throws Exception{
        int data = Integer.MIN_VALUE;
        if (size==0){
            throw new Exception("Queue is empty");
        }
        else{
            size--;
            data=array[front];
            array[front]=Integer.MIN_VALUE;
            front= (front+1)%Capacity;
        }
        return data;
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else{
            return false;
        }
    }
    public  boolean isFull(){
        if(size>=Capacity){
           return true;
        }
        else{
            return false;
        }
    }
    public int getSize(){
        return size;
    }

    public void printQueue(){
        int j=0;
        for(int i=front;j<size;i= (i+1)%Capacity){
            System.out.println(array[i]);
            j++;
        }
    }
}
