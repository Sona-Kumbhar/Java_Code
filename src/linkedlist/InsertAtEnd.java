package linkedlist;

public class InsertAtEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void insert(Node head)
    {
        Node x=new Node(90);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=x;

    }
    public static void  display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
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
        System.out.println();
        insert(a);
        display(a);
    }
}
