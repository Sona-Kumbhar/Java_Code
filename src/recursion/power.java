package recursion;

public class power {
    public static void print(int a,int b,int ans,int i) {
        if(i>b){
            System.out.println("power is :"+ans);
            return;
        }
        ans=ans*a;
        print(a,b,ans,i+1);
    }
    public static void main(String[] args){
        int a=3;
        int b=3;
        int ans=1;
        print(a,b,ans,1);
    }
}
