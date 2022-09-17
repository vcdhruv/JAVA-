import java.util.Scanner;
public class HollowRightTriangle{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==n || j==1 || j==i){
                    System.out.print("* ");     //it is increasing star with one with extra space...
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}