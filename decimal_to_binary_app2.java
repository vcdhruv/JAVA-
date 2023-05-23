import java.util.Scanner;

public class decimal_to_binary_app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        int decimal_num = sc.nextInt();
        int power = 1; //since 10 ^ 0 is 1
        int ans = 0;
        while (decimal_num > 0) {
            int remainder = decimal_num % 2;
            ans = ans + (remainder * power);
            decimal_num /= 2;
            power *= 10;
        }
        System.out.println("BINARY NUMBER:"+ans);
    }
}
