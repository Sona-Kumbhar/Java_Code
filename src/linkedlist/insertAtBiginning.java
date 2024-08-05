package linkedlist;

public class insertAtBiginning {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void insert(Node head){
        Node x=new Node(100);
        x.next=head;
        head=x;

        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }

    }


    public static void main(String[] args){
        Node a=new Node(11);
        Node b=new Node(12);
        Node c=new Node(13);
        Node d=new Node(14);

        a.next=b;
        b.next=c;
        c.next=d;

        insert(a);



    }
}
