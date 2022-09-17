import java.util.Scanner;
public class Conversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number:");
        int n = sc.nextInt();
        Decimal_To_Binary db = new Decimal_To_Binary();
        db.convert(n);

        System.out.print("Enter Any Decimal Number:");
        double x = sc.nextDouble();

        Decimal_To_Binary_Withdecimal dbd = new Decimal_To_Binary_Withdecimal();
        dbd.convert(x);
    }
}
class Decimal_To_Binary{
    int x;
    public void convert(int n){
        int count=0;
        String b = "";
        while (n!=0) {
            x=n%2;
            count++;
            System.out.print(x);
            n=n/2;
            b = x + b;  //for reverse string we have added "" firstly.....
           }
           System.out.println();
           System.out.print(b);
    }
}
class Decimal_To_Binary_Withdecimal{
    public void convert(double x){
        String str = Double.toString(x);
        for(int i=str.length();i>=0;i--)
        {
            System.out.print(i);
        }
    }
}