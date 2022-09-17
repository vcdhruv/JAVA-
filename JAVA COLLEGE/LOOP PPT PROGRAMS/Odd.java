//wap to print first n odd numbers
import java.util.Scanner;
public class Odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n =sc.nextInt();
        for(int i = 1;i<=n;i+=2){
            System.out.println(i);
        }
    }
}