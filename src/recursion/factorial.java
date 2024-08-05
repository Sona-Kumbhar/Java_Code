package recursion;
import java.util.Scanner;
public class factorial {
    public static void facto(int n,int i,int fact){
        if(i>n){
            System.out.println(fact);
            return;
        }
        fact=fact*i;
        facto(n,i+1,fact);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n=");
        int n=sc.nextInt();
        int fact=1;
        facto(n,1,fact);


    }
}
