package linkedlist;

public class MergetwoList {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
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
    public static void logic(Node h1,Node h2) {
        Node start1 = h1;
        Node t1 = h1;

        Node t2 = h2;

        while (t1.next != null) {
            t1 = t1.next;
        }
        t1.next = t2;
        //printing connect list
        Node temp = start1;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        int size1 = size(start1);
        System.out.println("size of list is:" + size1);
//        //next step




    }

    public static void main(String[] args){
        Node  a=new Node(10);
        Node b=new Node(11);
        Node  c=new Node(12);
        Node d=new Node(13);
        Node  e=new Node(14);
        Node f=new Node(15);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;


        Node  p=new Node(1);
        Node q=new Node(2);
        Node  r=new Node(3);
        Node s=new Node(4);
        Node  t=new Node(5);
        Node u=new Node(6);
        p.next=q;
        q.next=r;
        r.next=s;
        s.next=t;
        t.next=u;
        display(a);
        System.out.println();
        int len=size(a);
        System.out.println("size of list is:"+len);
        System.out.println();
        display(p);
        System.out.println();
        size(p);
        System.out.println("size of list is:"+len);
        System.out.println();
        logic(p,a);



    }
}
