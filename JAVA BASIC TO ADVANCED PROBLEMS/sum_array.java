import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to add:");
        int n = sc.nextInt();
        System.out.println();
        int[] elements = new int[n];
        for (int i = 0; i < elements.length; i++) {
            System.out.print("Enter element "+(i+1)+" :");
            elements[i] = sc.nextInt();
        }
        System.out.println();
        int result = 0;
        for (int i : elements) {
            result+=i;
        }
        System.out.println("Sum is:"+result);

        
    }
}
