import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.print("number is even");
        }
        else{
            System.out.print("number is odd");
        }
    }
}