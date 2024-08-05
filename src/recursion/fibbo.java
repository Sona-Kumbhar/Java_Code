package recursion;

public class fibbo {
    public static void print(int a,int b,int lim,int i){
        if(i>lim)
            return;
        int c=a+b;
        System.out.print(c+" ");
        print(b,c,lim,i+1);
    }
    public static void main(String[] args){
        int a=0;
        int b=1;
        int n=10;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int lim=(n-2);
        print(a,b,lim,1);

    }
}
