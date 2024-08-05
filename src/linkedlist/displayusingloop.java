package linkedlist;

public class displayusingloop {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
     public static int size(Node head){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
         System.out.println();
        return size;


     }
     public static void printforloop(Node head,int size){
        Node temp=head;
        for(int i=0;i<size;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
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
        printforloop(a,s);

    }
}
