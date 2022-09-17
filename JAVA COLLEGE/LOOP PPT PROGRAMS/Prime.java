//wap to check given number is prime or not
import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        int flag = 0;
        for(int i=2;i<=(n-1);i++){
            if(n%i==0){
                flag++;
            }
        }
        if(flag == 0){
            System.out.print("prime");
        }
        else{
            System.out.print("not prime");
        }
    }
}