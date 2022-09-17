import java.util.Scanner;
public class DoubleHill{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=i;k<=n;k++){
                System.out.print("a");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* "); 
            }
            for(int l=i;l<n;l++){
                System.out.print("b "); // just give extra space and program is done...
            }
            for(int m=1;m<=i;m++){
                System.out.print("* ");
            }
                
            System.out.println("");
        }
    }
}