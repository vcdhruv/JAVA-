import java.util.Scanner;
public class Pattern3{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1,p=5;i<=n;i++,p--){
            for(int j=1;j<=n;j++){
                System.out.print(p +" ");
            }
            System.out.println("");
        }
    }
}