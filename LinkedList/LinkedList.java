package LinkedList;

public class LinkedList{
    Node head = null;
    public static void main(String []args){

        LinkedList linkedList=new LinkedList();
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.addInFront(5);
        linkedList.addAt(10,5);
        linkedList.addAt(10,4);
        linkedList.traverseLinkedList();
        linkedList.deleteFront();
        linkedList.traverseLinkedList();
        System.out.println("index is: "+ linkedList.search(8));
    }


    private int search(int i) {
        int index=0;
        Node temp=head;
        if (temp==null) {
            return -1;
        }
        while(temp!=null){
            if (temp.val==i) return index;
            temp=temp.next;
            index++;
        }

        return -1;
    }

    void addInFront(int val){
        System.out.println("Added "+ val +" in front");
        Node tempNode=new Node(val);
        tempNode.next=head;
        head=tempNode;
    }
    void add(int val){
        System.out.println("Added "+ val +" in end");
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

    void addAt(int val,int position){

        int count=0;
        Node tempNode=new Node(val);
        Node temp=head;
        Node previous=null;
        if(temp==null  || position==0){
           tempNode.next=head;
           head=tempNode;
        }else {
            while (temp.next != null && count<position) {

                previous=temp;
                temp = temp.next;
                count++;
            }
            if(count-position!=0){
                System.out.println("Index out of bound give element in range 0 to "+ (count));
                return;
            }
            else{
            tempNode.next=temp;
            previous.next = tempNode;}

        }
        System.out.println("Added "+ val +" at index: "+ position);
    }

    void deleteFront(){
        //java has garbage collector , so we don't need to free memory
        System.out.println("deleting value from front: "+head.val);
        if(head==null) return;
        head=head.next;

    }

    void deleteEnd(){
        if(head==null || head.next==null){
            head=null;
            return;
        }
        Node temp=head,previous=null;
        while(temp.next!=null){
            previous=temp;
            temp=temp.next;
        }
        previous.next=null;
        temp=null;

    }

    void traverseLinkedList(){
        Node temp=head;
        if (temp==null) {
            System.out.println("Nothing in list to read");
            return;
        }
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp=temp.next;
        }
        System.out.println();
    }

}
