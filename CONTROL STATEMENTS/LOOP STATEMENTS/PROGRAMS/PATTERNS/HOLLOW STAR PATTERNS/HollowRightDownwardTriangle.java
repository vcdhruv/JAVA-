import java.util.Scanner;
public class HollowRightDownwardTriangle{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(i==1 || j==i || j==n)
                {
                    System.out.print("* "); //it is decreasing star with one extra space...
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}