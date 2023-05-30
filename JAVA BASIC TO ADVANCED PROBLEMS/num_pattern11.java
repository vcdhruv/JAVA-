import java.util.Scanner;

public class num_pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows:");
        // System.out.print("Enter the number of columns:");
        for (int i = 1; i <= 5; i++) {
            int k = 1;
            for (int j = 1; j <= 6; j++) {
                if (j%2==0) {
                    System.out.print(i+" ");
                }else{
                    System.out.print(k+" ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
