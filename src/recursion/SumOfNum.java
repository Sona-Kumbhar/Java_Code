package recursion;

public class SumOfNum {
    public static void  print(int n,int i,int sum){
        if(i>n){
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        print(n,i+1,sum);
    }
    public static void main(String[] args){
        int n=10;
        int i=1;
        int sum=0;

      print(n,i,sum);
    }
}
