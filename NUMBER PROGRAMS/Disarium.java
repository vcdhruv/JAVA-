import java.util.*;
public class Disarium{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        int temp,x,sum=0,count=0;
        temp=n;
        while (n!=0) {
            count++;
            n=n/10;
        }
        n=temp;
        System.out.print("no. of digits in "+temp+" is"+count);
        System.out.println();
        for(int i=count;i>0;i--){
            x = n%10;
            sum = sum + (int)Math.pow(x, i);
            n = n/10;
        }
        if(sum==temp){
            System.out.print("DISARIUM NUMBER");
        }
        else{
            System.out.print("NOT DISARIUM NUMBER");
        }
    }
}