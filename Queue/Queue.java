package Queue;

public class Queue {
    Node head=null;
    public static void main(String []args){
    Queue queue=new Queue();
    queue.enqueue(7);
    queue.enqueue(8);
    queue.enqueue(9);
    queue.dequeue();
    System.out.println("Is queue Empty :"+ queue.isEmpty());
    queue.dequeue();
    queue.dequeue();
    System.out.println("Is queue Empty :"+ queue.isEmpty());
    }
    void enqueue(int val){
        System.out.println("Added "+ val +" in queue");
       Node tempNode=new Node(val);
        Node temp=head;
        if(temp==null){
            head= new Node(val);

        }else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = tempNode;
        }
    }

    void dequeue(){
        System.out.println("deleting value from front: "+head.val);
        if(head==null) return;
        head=head.next;
    }

    boolean isEmpty(){
        return head == null;
    }
}
