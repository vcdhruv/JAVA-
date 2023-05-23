import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary number:");
        int num = sc.nextInt();
        int num_length = Integer.toString(num).length();
        int decimal = 0;
        for (int i = 0; i < num_length; i++) {
            int last_dig = num%10;
            decimal = decimal +  (int) (last_dig * Math.pow(2, i));
            num = num / 10;
        }
        System.out.print("DECIMAL NUMBER IS:"+decimal);
    }
}
