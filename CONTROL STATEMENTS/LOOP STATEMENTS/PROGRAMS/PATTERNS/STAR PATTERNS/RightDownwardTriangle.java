import java.util.Scanner;
public class RightDownwardTriangle{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* "); //it is decreasing star with one extra space...
            }
            System.out.println("");
        }
    }
}