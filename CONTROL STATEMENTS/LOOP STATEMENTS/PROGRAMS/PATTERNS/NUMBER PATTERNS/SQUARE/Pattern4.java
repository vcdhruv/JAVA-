import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int p=5;
            for(int j=1;j<=n;j++){
                System.out.print(p-- +" ");
            }
            System.out.println("");
        }
    }
}