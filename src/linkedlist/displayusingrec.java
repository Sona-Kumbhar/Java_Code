package linkedlist;

public class displayusingrec{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void displayrec(Node head){
         Node temp=head;
        if(temp==null) return;
        System.out.print(temp.data+" ");
        displayrec(temp.next);
        System.out.println();
    }
    public static void displayreverse(Node head){
        Node temp=head;
        if(temp==null){
            return;
        }
        else{
            displayreverse(temp.next);
            System.out.print(temp.data+" ");
        }
    }
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(11);
        Node c=new Node(12);
        Node d=new Node(13);

        a.next=b;
        b.next=c;
        c.next=d;

        displayrec(a);
        displayreverse(a);
    }
}
