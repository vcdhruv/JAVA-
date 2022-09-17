/* wap tp display pattern 

*
* *
* * *
* * * *
* * *
* *
*

*/
import java.util.Scanner;
public class Pattern10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of rows :");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("* "); 
            }
            System.out.println();
        }
        for(int m = 1; m <= n; m++){
            for(int k = m; k< n; k++){
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}