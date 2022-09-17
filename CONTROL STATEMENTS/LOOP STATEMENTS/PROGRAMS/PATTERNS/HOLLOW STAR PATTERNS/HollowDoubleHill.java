import java.util.Scanner;
public class HollowDoubleHill{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=i;k<=n;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i==n || j==1 || j==i)
                {
                    System.out.print("* "); 
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int l=i;l<n;l++){
                System.out.print("  "); // just give extra space and program is done...
            }
            for(int m=1;m<=i;m++){
                if(m==1 || m==i || i==n)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
                
            System.out.println("");
        }
    }
}