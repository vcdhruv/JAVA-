import java.util.*;
public class Automorphic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        int x,temp,q,noOfDigits=0;
        temp=n;
        q = n*n;
        while (n!=0) {
            x = n%10;
            noOfDigits++;
            n=n/10;
        }
        int last = (int)(q%Math.pow(10, noOfDigits));
        if (temp==last) {
            System.out.print("AUTOMORPHIC");
        } else {
            System.out.print("NOT AUTOMORPHIC");
        }
    }
}