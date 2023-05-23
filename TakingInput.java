import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desired sentence:");
        String sen = sc.nextLine();
        System.out.println("Entered senetce is:"+sen);
        System.out.print("Enter any desired number:");
        int number = sc.nextInt();
        System.out.println("Entered number is:"+number);
        System.out.print("Enter desired line:");
        String line = sc.next();
        System.out.println("Entered line is( next will not take any values after space ):"+line);
    }
}
