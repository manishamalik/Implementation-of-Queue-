package revisionQueue;

public class QueueMain {

    public static void main(String arg[])throws Exception {
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
//        ---------------------------ImplementStack-------------------------------
        ImplementStack stack = new ImplementStack();
        stack.push(12);
        stack.push(15);
        stack.push(18);
        stack.push(2);
        stack.pop();
        stack.printStack();
//        --------------------------- BalancingOfSymbol----------------------------
        BalancingOfSymbol balancingOfSymbol = new BalancingOfSymbol();
        boolean b= balancingOfSymbol.isBalance();
        if(b){
            System.out.println("it is balanced");
        }
        else{
            System.out.println("it is not balanced");
        }
//        -------------------------infix to postfix ---------------------------------
        ImplementInfixToPostfixUsingStack infixToPostfix =new ImplementInfixToPostfixUsingStack();
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        String st= infixToPostfix.convertInfixToPostfix(exp);

        System.out.println(st);
    }

}
