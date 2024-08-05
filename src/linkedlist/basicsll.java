package linkedlist;

public class basicsll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args)
    {
        Node a=new Node(10);
        Node b=new Node(12);
        Node c=new Node(160);

        a.next=b;
        b.next=c;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);//error will come



    }
    }
