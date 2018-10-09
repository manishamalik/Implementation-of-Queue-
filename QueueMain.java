package revisionQueue;

public class QueueMain {

    public static void main(String arg[])throws Exception{
//  -----------------------Implementation of queue using circular array--------------
//        Queue queue =new Queue();
//        queue.enQueue(12);
//        queue.enQueue(15);
//        queue.enQueue(14);
//        queue.enQueue(1);
//        queue.enQueue(2);
//        queue.enQueue(3);
//        queue.enQueue(4);
//        queue.deQueue();
//        queue.deQueue();
//        queue.deQueue();
//        queue.enQueue(5);
//        queue.enQueue(6);
//        queue.deQueue();
//        queue.printQueue();
//  ------------------------Implementation of queue using Linked list
        QueueUsingLinkedList queue1 = new QueueUsingLinkedList();
        queue1.enQueue(12);
        queue1.enQueue(14);
        queue1.deQueue();
        queue1.deQueue();
        queue1.enQueue(13);
        queue1.printQueue();

    }

}
