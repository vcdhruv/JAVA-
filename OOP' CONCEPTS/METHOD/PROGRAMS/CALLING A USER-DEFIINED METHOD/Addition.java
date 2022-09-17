import java.util.Scanner;
public class Addition{
    public static void main(String[] args){
        int n1 , n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1:");
        n1 = sc.nextInt();
        System.out.println("enter n2:");
        n2 = sc.nextInt();
        int result = add(n1,n2);
        System.out.println(n1 + "+" + n2 + "=" + result);
    }
    public static int add(int n1 , int n2){
        int s = (n1 + n2);
        return s;
    }
}