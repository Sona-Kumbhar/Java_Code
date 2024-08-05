package linkedlist;

public class insertAtBeginning {
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
        void insertatbig(int val){
            Node temp= new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else {
                temp.next = head;
                head = temp;
            }

        }
        void display(){
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
        }

        int size(){
            int count=0;
            while(head!=null){
                count++;
                head=head.next;
            }
            return count;
        }

    }
    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.insertatbig(4);
        ll.insertatbig(2);
        ll.insertatbig(5);
        ll.insertatbig(100);

        ll.display();
        System.out.println();
        int s=ll.size();
        System.out.println("size is= "+s);

    }
}
