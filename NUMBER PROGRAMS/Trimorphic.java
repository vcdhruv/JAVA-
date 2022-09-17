/*
 EASY APPROACH:
 cube =n*n*n
 boolean flag=true;
 while(n!=0){
     if(n%10!=cube%10){
         flag = false;
         break;
     }
     n=n/10;
     cube=cube/10;
 } 
 if(flag==false){
     Syso("not trimorphic");
 }
 else{
     Syso("trimorphic")
 }

 //MORE RESPONSIVE THAN MINE BELOW LOGIC
 */

import java.util.Scanner;
public class Trimorphic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = sc.nextInt();
        int temp,count=0,x;
        temp=n;
        String s = "";
        while (n!=0) {
            count++;
            n=n/10;
        }
        n=temp;
        System.out.print("n:"+n);
        System.out.println();
        n=n*n*n;
        System.out.print("cube of n:"+n);
        for(int i=0;i<count;i++)
        {
            x=n%10;
            s = x + s;
            n = n/10;
        }
        System.out.println();
        System.out.print("s:"+s);
        System.out.println();
        System.out.print("temp:"+temp);
        System.out.println();
        String str = Integer.toString(temp);
        if(s.equals(str)){
            System.out.print("TRIMORPHIC");
        }
        else{
            System.out.print("NOT TRIMORPHIC");
        }
    }
}