package linkedlist;

public class sumOfData {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int  addition(Node head){
        Node temp=head;
        int sum=0;
        while(temp!=null){
            sum=sum+temp.data;
            temp=temp.next;
        }
        return sum;
    }
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(3);
        Node d=new Node(40);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;

        int sum=addition(a);
        System.out.println("addition of LL is:"+sum);


    }
}
