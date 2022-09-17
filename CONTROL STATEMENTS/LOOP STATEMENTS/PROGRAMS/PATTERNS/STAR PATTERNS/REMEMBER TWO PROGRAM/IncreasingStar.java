import java.util.Scanner;
// remember this program to make any star program..
public class IncreasingStar{
    public static void main(String[] args){
        System.out.print("Enetr value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}