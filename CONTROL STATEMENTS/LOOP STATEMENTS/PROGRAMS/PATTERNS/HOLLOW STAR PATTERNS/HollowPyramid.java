import java.util.Scanner;
public class HollowPyramid{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<i;k++){
                if(i==n || k==1)
                {   // to remove one star just do k<i instead of keeping k<=i
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int l=1;l<=i;l++){
                if(i==n || l==i)
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