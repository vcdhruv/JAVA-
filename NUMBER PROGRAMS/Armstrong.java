import java.util.*;
public class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        int x,temp,sum=0;
        temp=n;
        while (n!=0) {
            x = n%10;
            sum = sum + x*x*x;
            n = n/10;
        }
        if (sum==temp) {
            System.out.print(+temp+" is ARMSTRONG NUMBER");
        } else {
            System.out.print(+temp+" is not ARMSTRONG NUMBER");
        }
    }
}