import java.util.Scanner;

public class num_pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int r = sc.nextInt();
        System.out.print("Enter number of columns:");
        int c = sc.nextInt();
        // System.out.println(2 % 10);
        int number = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (number <= 9) {
                    System.out.print(number+"  ");
                    number++;    
                } else {
                    System.out.print(number+" ");
                    number++;
                }
                
            }
            System.out.println();
        }
    }
}


