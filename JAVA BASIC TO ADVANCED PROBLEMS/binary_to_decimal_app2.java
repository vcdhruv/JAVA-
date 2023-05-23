import java.util.Scanner;

public class binary_to_decimal_app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number:");
        int binary_number = sc.nextInt();
        int power = 1; //since 2^0 is 1
        int ans = 0;
        while (binary_number > 0) {
            int unit_dig = binary_number % 10;
            ans = ans + (unit_dig*power);
            binary_number /= 10;
            power*=2; //to increase power by 2
        }
        System.out.println("DECIMAL NUMBER:"+ans);
    }
}
