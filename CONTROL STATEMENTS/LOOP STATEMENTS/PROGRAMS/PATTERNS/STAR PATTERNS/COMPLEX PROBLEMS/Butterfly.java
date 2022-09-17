import java.util.Scanner;
public class Butterfly{
    public static void main(String[] args){
        System.out.print("enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=i;k<n;k++){   
                System.out.print("a");      //first make first loop then copy it and paste full loop and make changes according to pattern from
            }                               //two remebarance pattern...
            for(int m=i;m<n;m++){
                System.out.print("b");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            for(int k=1;k<i;k++){   
                System.out.print("a");
            }
            for(int m=1;m<i;m++){
                System.out.print("b");
            }
            for(int l=i;l<=n;l++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
