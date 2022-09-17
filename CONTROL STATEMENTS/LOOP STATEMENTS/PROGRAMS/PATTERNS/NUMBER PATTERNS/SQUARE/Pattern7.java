import java.util.Scanner;
public class Pattern7{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(p+ " ");
                p+=2;
            }
            System.out.println("");
        }
    }
}