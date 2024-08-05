package linkedlist;

public class GetElement {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int size(Node head){
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    public static void findelement(Node head,int idx){
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        System.out.println("given index element is:"+temp.data);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(5);
        Node d=new Node(10);
        Node e=new Node(20);
        Node f=new Node(200);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        display(a);
        System.out.println();
        int len=size(a);
        System.out.println("lenth of list is="+len);
           findelement(a,3);

    }
}
