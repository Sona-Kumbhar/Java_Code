package recursion;

public class name {
    public static void print(int n,int i){
        if(i>n){
            return;
        }
        System.out.print("sonali"+" ");
        print(n,i+1);
    }
    public static void main(String[] args){
        int i=1;
        int n=5;
        print(n,i);
    }
}
