package recursion;

public class printnumber {
    public static void print(int n){
        int lim=10;
        if(n>lim){
            return;
        }
        System.out.println(n+" ");
        print(n+1);
    }
    public static void main(String[] args){
        int n=1;
        print(n);
    }
}
