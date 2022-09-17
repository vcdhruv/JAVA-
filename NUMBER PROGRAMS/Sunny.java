import java.util.*;
public class Sunny{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag=false;
        for (int i = 0; i < n; i++) {
            //logic for perfect square....
            if (i*i==n) {
                flag=true;
            }
        }
        if(flag==false){
            System.out.print("not sunny");
        }
        else{
            n=n-1;
            System.out.println(n+" is sunny");
        }
    }
}