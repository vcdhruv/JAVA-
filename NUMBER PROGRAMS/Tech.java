
import java.util.Scanner;
public class Tech{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        int sum=0,temp,x,y,z,count=0;
        temp=n;
        z=temp;
        while (n!=0) {
            x=n%10;
            count++;
            n=n/10;
        }
        System.out.print("no. of digits in "+temp+" is:"+count);
        System.out.println();
        if(count%2==0){
                for(int i=0;i<count/2;i++){
                    y=temp%100;
                    sum = sum+y;
                    temp=temp/100;
            }
        }
        System.out.println("sum:"+sum);
        if(sum*sum==z){
            System.out.print("TECH NUMBER");
        }
        else{
            System.out.print("NOT TECH NUMBER");
        }
    }
}