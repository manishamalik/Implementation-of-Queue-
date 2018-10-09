package revisionQueue;

public class QueueUsingLinkedList {
    private SinglyLinkedList singlyLinkedList =new SinglyLinkedList();
    public void enQueue(int data){
        singlyLinkedList.insertAtEnd(data);
    }
    public void deQueue() throws Exception{
        singlyLinkedList.deleteAtBegin();
    }
    public void printQueue(){
        singlyLinkedList.printList();
    }
}
