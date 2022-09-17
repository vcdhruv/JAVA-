import java.util.*;
public class Perfect{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        int temp,sum=0;
        temp=n;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(sum==temp){
            System.out.print("PERFECT NUMBER");
        }
        else{
            System.out.print("NOT PERFECT");
        }
    }
}