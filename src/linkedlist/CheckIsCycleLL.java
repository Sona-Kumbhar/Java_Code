package linkedlist;

public class CheckIsCycleLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void check(Node head) {
        Node temp = head;
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("LL is cyclic");
                break;
            }

            }
        }
    public static void display(Node head){
        Node temp=head;
        for(int i=1;i<20;i++){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node a=new Node(2);
        Node b=new Node(4);
        Node c=new Node(6);
        Node d=new Node(8);
        Node e=new Node(10);
        Node f=new Node(12);
        Node g=new Node(14);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=c;

        display(a);
        check(a);
    }
}
