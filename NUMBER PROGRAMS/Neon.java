import java.util.*;
public class Neon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        int x,temp,sum=0;
        temp=n;
        n= n*n;
        while(n!=0){
            x = n%10;
            sum = sum + x;
            n = n/10;
        }
        if (sum==temp) {
            System.out.print("NEON");
        } else {
            System.out.print("NOT NEON");
        }
    }
}