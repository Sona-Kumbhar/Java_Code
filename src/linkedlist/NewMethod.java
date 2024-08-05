package linkedlist;

public class NewMethod {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;

        void insert(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }
            void display(){
            Node temp=head;
            int size=0;
            while(temp!=null){
                size++;
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
                System.out.println();
                System.out.println("size of list is : "+ size);
            }


    }
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);
        ll.insert(70);
        ll.insert(80);
        ll.insert(90);
        ll.insert(100);

        ll.display();
        System.out.println();



    }
}
