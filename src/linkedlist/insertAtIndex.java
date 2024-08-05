package linkedlist;

public class insertAtIndex {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void insert(Node head,int idx){
        Node temp=head;
        Node x=new Node(100);
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        x.next=temp.next;
        temp.next=x;
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
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
        display(a);
        System.out.println();
        insert(a,4);
        display(a);



    }
}
