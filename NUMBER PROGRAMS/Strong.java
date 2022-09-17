import java.util.*;
public class Strong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        int x,temp,sum=0;
        temp=n;
        while(n!=0){
            x=n%10;
            int fact=1;
            for(int i=1;i<=x;i++){
                fact = fact*i;
            }
            sum = sum + fact;
            n = n/10;
        }
        System.out.print(sum);
        if(sum==temp){
            System.out.print("STRONG");
        }
        else{
            System.out.print("NOT STRONG");
        }
    }
}