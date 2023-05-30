import java.util.Scanner;

public class Assignment1{
    public static void main(String[] args) {
        int x = 2;
        int y = 4;
        int product = x*y;
        System.out.println("Product of "+x+" and "+y+" is:"+product);

        char ch = 'U';
        int ascii_U = (int)ch;
        System.out.println("ASCII value of U is: "+ascii_U);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:");
        float length = sc.nextFloat();
        System.out.print("Enter breadth:");
        float breadth = sc.nextFloat();
        System.out.println("Area :"+(length*breadth));

        System.out.print("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Cube :"+(n*n*n));

        System.out.print("Enter first number you want to swap:");
        int f_n = sc.nextInt();
        System.out.print("Enter second number you want to swap:");
        int s_n = sc.nextInt();

        int temp = f_n;
        f_n = s_n;
        s_n = temp;

        System.out.println("first number after swapping:"+f_n);
        System.out.println("second number after swapping:"+s_n);
    }
}