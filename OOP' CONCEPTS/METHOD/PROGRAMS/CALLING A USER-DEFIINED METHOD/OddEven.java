import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();
        findOddEven(num);
    }
public static void findOddEven(int num){
    if(num%2==0){
        System.out.println("number is even");
    }
    else{
        System.out.println("number is odd");
    }
}
}