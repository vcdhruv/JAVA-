//Write a program to get number from the user and print whether it is positive or negative.4
import java.util.Scanner;
public class NumberDetermine{
    public static void main(String[] args){
        System.out.print("enter value of number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("number entered is positive");
        }
        else if(number == 0){
            System.out.println("number is zero");
        }
        else{
            System.out.println("number entered is negative");
        }
    }
}