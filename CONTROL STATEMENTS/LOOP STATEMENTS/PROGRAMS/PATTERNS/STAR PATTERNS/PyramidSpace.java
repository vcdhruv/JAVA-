import java.util.Scanner;
public class PyramidSpace{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){   
                System.out.print("* ");     // it is a combination of decreasing space and increasing star with one extra space in increasing star...
            }
            System.out.println("");
        }
    }
}