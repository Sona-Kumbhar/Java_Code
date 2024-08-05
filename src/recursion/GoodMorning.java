package recursion;
import java.util.Scanner;
public class GoodMorning {
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(1);
        print(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
