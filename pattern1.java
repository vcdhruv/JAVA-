import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of rows:");
        int rows = sc.nextInt();
        System.out.print("enter the number of columns:");
        int column = sc.nextInt();
        outer:for(int i=1;i<=rows;i++){
            inner:for(int j=1;j<=column;j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
}
