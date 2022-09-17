import java.util.Scanner;
public class HollowButterfly{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=i;k<n;k++){   
                System.out.print(" ");      //first make first loop then copy it and paste full loop and make changes according to pattern from
            }                               //two remebarance pattern...
            for(int m=i;m<n;m++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                if(l==1 || l==i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(i==n || j==i || j==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k=1;k<i;k++){   
                System.out.print(" ");
            }
            for(int m=1;m<i;m++){
                System.out.print(" ");
            }
            for(int l=i;l<=n;l++){
                if(i==n || l==i || l==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
