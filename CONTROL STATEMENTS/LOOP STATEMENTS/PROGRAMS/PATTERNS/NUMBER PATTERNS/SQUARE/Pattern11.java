import java.util.Scanner;
public class Pattern11{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=1,x;
        for(int i=1;i<=n;i++){
            x=i;
            for(int j=1;j<=n;j++){
                System.out.print(x++ +" ");
                x+=n;
            }
            System.out.println("");
        }
    }
}