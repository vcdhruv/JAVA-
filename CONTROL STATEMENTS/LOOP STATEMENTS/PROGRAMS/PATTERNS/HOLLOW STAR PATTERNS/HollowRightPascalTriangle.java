import java.util.Scanner;
public class HollowRightPascalTriangle{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            for(int k=i;k<=n;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                if(i==n || j==i || j==n)
                {
                    System.out.print("*");
                }            
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
