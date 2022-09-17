import java.util.Scanner;
public class Pyramid{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<i;k++){   // to remove one star just do k<i instead of keeping k<=i
                System.out.print("*");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}