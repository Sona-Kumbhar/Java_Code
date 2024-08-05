package BinaryTree;
import java.util.*;
public class BTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class Binary{
        static int idx=-1;
        public static Node createtree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            else{
                Node newnode=new Node(nodes[idx]);
                newnode.left=createtree(nodes);
                newnode.right=createtree(nodes);
                return newnode;
            }

        }

    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static int  height(Node root){
        if(root==null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static int  addition(Node root){
        if(root==null) return 0;
        return root.data+addition(root.left)+addition(root.right);
    }
    public static int total(Node root){
        if(root==null) return 0;
        return 1+total(root.left)+total(root.right);
    }
    public static void main(String[] args){
        int nodes[]={1,2,3,-1,-1,5,-1,-1,3,-1,9,-1,-1};
        Binary obj=new Binary();
        Node root=obj.createtree(nodes);
        //main root is following
        System.out.println(root.data);
        //preorder printing
        System.out.println("preoredr list is following:");
        preorder(root);
        System.out.println();
        System.out.println("post order list is following:");
        postorder(root);
        System.out.println();
        System.out.println("inorder list is following:");
        inorder(root);
        System.out.println();
        System.out.println("height of Binary tree is following:");
       int H=height(root);
        System.out.println("height of binary tree is:"+H);
        // sum of all Nodes in Btree
        System.out.println("sum of all nodes are following:");
        int sum=addition(root);
        System.out.println("sum is :"+sum);
        //Get total number of nodes in Btree
        System.out.println("Total number of nodes in Btree are following:");
        int total_nodes=total(root);
        System.out.println("Total Number Of Nodes Are:"+total_nodes);

    }
}
