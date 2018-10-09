package revisionQueue;

public class SinglyLinkedList {
    ListNode head =null;
    public void insertAtEnd(int data){
        ListNode newNode =new ListNode(data);
        if(head==null){
            head=newNode;
        }
        else{
            ListNode node =head;
            while(node.getNext()!=null){
                node=node.getNext();
            }
            node.setNext(newNode);

        }
    }
    public void insertAtBegin(int data){
        ListNode newNode =new ListNode(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.setNext(head);
            head=newNode;
        }
    }

    public ListNode getHead() {
        return head;
    }

    public int deleteAtBegin() throws Exception{
        int data = Integer.MIN_VALUE;
        if(head==null){
            throw new Exception("Linked list is empty ");

        }

        else if(head.getNext()==null){
            data=head.getData();
            head=null;
            System.out.println("only one element is there in linked list. now list is empty ");
        }
        else{
            data=head.getData();
            head= head.getNext();

        }
        return data;
    }
    public int deleteAtEnd() throws Exception{
        int data = Integer.MIN_VALUE;
        if(head==null){
            throw new Exception("Linked list is empty ");

        }
        else if(head.getNext()==null){
            data=head.getData();
            head=null;
            System.out.println("only one element is there in linked list. now list is empty ");
        }
        else{
            ListNode node = head;
            ListNode temp = node;
            while(node.getNext()==null){
                temp= node;
                node= node.getNext();
            }
            data=node.getData();
            temp.setNext(null);
            head= head.getNext();
        }
        return data;
    }
    public void printList(){
        ListNode node=head;
        if(head==null){
            System.out.println("nothing to print");
        }
        while(node!=null){
            System.out.println(node.getData());
            node= node.getNext();
        }
    }
}
