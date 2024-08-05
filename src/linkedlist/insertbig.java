package linkedlist;

public class insertbig {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node a=new Node(11);
        Node b=new Node(12);
        Node c=new Node(13);
        Node d=new Node(14);
        Node e=new Node(15);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        Node x=new Node(100);
        e.next=x;
        display(a);

    }
}
