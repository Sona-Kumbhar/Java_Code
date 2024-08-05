package recursion;

public class SumOfDigit {
    public static void print(int n,int sum){
        if(n<=0){
            System.out.println("sum of digit is:"+sum);
            return;
        }
        else{
            int p=n%10;
            sum=sum+p;
            int a=n/10;
            print(a,sum);
        }
    }
    public static void main(String[] args){
        int n=12457;
        int sum=0;
        print(n,sum);
    }
}
