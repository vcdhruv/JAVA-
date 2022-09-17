import java.util.Scanner;
public class ReversePyramid{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++){   // combination of increasing space and decreasing star with extra space..
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}