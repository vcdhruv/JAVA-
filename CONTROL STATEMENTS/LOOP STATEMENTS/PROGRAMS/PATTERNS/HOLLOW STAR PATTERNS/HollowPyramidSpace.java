import java.util.Scanner;
public class HollowPyramidSpace{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(i==n || k==1 || k==i)
                {   
                    System.out.print("* ");     // it is a combination of decreasing space and increasing star with one extra space in increasing star...
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}