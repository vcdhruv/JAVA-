import java.util.Scanner;
public class PrimeNumberLogic1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        int count=0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.print("number is prime");
        }
        else{
            System.out.print("number is not prime");
        }
    }
}