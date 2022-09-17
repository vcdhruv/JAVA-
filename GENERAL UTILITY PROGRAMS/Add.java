import java.util.Scanner;
public class PrimeNumberLogic2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        int flag=0,i=2;
        while(i<=(n/2)){
            if(n%i==0){
                flag=1;
                break;
            }
            else{
                i++;
            }
        }
        if(flag==0){
            System.out.print("number is prime");
        }
        else{
            System.out.print("number is not prime");
        }
    }
}