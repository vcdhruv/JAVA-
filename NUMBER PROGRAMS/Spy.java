import java.util.Scanner; 
public class Spy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        int x,temp,sum=0,product=1;
        temp=n;
        while(n!=0){
            x = (n%10);
            sum = sum+x;
            product = product*x;
            n = n/10;
        }
        if (sum==product) {
            System.out.print("SPY");
        } else {
            System.out.print("NOT SPY");
        }
    }
}