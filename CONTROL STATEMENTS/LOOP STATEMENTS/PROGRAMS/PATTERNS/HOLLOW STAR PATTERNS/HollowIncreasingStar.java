import java.util.Scanner;
// remember this program to make any star program..
public class HollowIncreasingStar{
    public static void main(String[] args){
        System.out.print("Enetr value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if(i==n || j==1 || j==i)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}