package recursion;

public class Incresingdecresingorder {
    public static void incre(int n){
        if(n==0) return;
        System.out.print(n+" ");
        incre(n-1);
    }
    public static void decre(int n){
        if(n==0) return;
        decre(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        int n=10;
        incre(n);
        decre(n);
    }
}
