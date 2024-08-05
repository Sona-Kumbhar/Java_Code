package linkedlist;

public class OddEven {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void check(Node head) {
        Node x = new Node(-1);
        Node y = new Node(-1);
        Node start = head;
        Node agla = head;

        while (start != null) {
            agla = start.next;
            if (start.data % 2 != 0) {
                start.next = x;
                x = start;
                start = agla;
            } else {
                start.next = y;
                y = start;
                start = agla;
            }
        }
        Node t1 = y;
        Node s1 = y;
        Node t2 = x;
        Node s2 = x;
        //Even list printing
        int len1 = 0;
        while (y != null) {
            len1++;
            System.out.print(y.data + " ");
            y = y.next;
        }
        System.out.println();
        System.out.println("lenth is l1: " + len1);
        System.out.println();
        //odd list printing
        int len2 = 0;
        while (x != null) {
            len2++;
            System.out.print(x.data + " ");
            x = x.next;
        }
        System.out.println();
        System.out.println("lenth is l2 : " + len2);
        //removing -1
        for (int i = 1; i < len1 - 1; i++) {
            t1 = t1.next;
        }
        t1.next=null;
        for (int i = 1; i < len2 - 1; i++) {
            t2 = t2.next;
        }
        t2.next=s1;
        System.out.println();
        while(s2!=null){
            System.out.print(s2.data+" ");
            s2=s2.next;
        }

       //finally printing ohhh

    }
        public static void display (Node head){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        public static void main (String[]args){
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
            Node f = new Node(6);
            Node g=new Node(10);
            Node h=new Node(20);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next=g;
            g.next=h;

            display(a);
            System.out.println();
            check(a);
            System.out.println();


        }
    }
