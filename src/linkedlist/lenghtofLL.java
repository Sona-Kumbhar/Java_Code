package linkedlist;

public class lenghtofLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int size(Node head)
    {
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(11);
        Node c=new Node(12);
        Node d=new Node(13);
        Node e=new Node(14);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        int s=size(a);
        System.out.println("size is :"+s);


    }
}
