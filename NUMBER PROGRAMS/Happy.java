import java.util.*;
public class Happy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        int x,sum;
        while(n>9){
            sum=0;
            while (n!=0) {
                x = n%10;
                sum = sum + x*x;
                n = n/10;
            }
            n = sum;
        }
        if(n==1){
            System.out.print("HAPPY");
        }else{
            System.out.print("NOT HAPPY");
        }
    }
}