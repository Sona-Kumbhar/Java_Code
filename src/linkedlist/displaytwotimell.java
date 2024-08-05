package linkedlist;

public class displaytwotimell {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static int size(Node h1){
        Node temp=h1;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public static void printexceptlastone(Node head,int s){
        Node temp=head;
        for(int i=1;i<=s-1;i++)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();


    }
    public static void printalternatenode(Node h1){
        Node temp=h1;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next.next;
        }
        System.out.println();
        return;
    }
    public static void reverse(Node h1){
        if(h1==null)
            return;
        reverse(h1.next);
        System.out.print(h1.data+" ");

    }

    public static void main(String[] args)
    {
        Node a=new Node(10);
        Node b=new Node(110);
        Node c=new Node(12);
        Node d=new Node(13);
        Node e=new Node(14);
        Node f=new Node(15);
        Node g=new Node(16);
        Node h=new Node(17);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        print(a);
        print(a);
          int s= size(a);
        System.out.println(s);
        printexceptlastone(a,s);
        printalternatenode(a);
         reverse(a);
    }
}
