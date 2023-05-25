import java.util.Scanner;

public class num_pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int r = sc.nextInt();
        System.out.print("Enter number of columns:");
        int c = sc.nextInt();
        for (int i = r; i >= 1; i--) {
            for (int j = c; j >= 1; j--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}


