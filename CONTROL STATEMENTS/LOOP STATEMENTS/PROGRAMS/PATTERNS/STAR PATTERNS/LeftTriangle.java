import java.util.Scanner;
public class LeftTriangle{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");  //it is combination of decreasing space and increasing star...
            }
            for(int k=1;k<=i;k++){   
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}