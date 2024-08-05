package linkedlist;

public class append {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void appendnodes(Node head,int n){
        Node h1=head;
        Node s1=head;
        for(int i=1;i<n;i++){
            h1=h1.next;
        }
        Node h2=h1.next;
        Node s2=h1.next;
        h1.next=null;
        while(h2.next!=null){
            h2=h2.next;
        }
        h2.next=s1;

        //printing apppend list
        while(s2!=null){
            System.out.print(s2.data+" ");
            s2=s2.next;
        }

    }
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        appendnodes(a,3);

    }
}
