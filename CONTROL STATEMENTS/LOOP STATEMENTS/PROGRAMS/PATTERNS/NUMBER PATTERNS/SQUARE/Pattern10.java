import java.util.Scanner;
public class Pattern10{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int p=1;
                if(j%2!=0)
                {
                    System.out.print(i +" ");
                }
                else{
                    System.out.print(p++ +" ");
                }
            }
            System.out.println("");
        }
    }
}