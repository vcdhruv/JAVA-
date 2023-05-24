import java.util.Scanner;

import algebra.operations;

public class calling_package {
    public static void main(String[] args) {
        operations op = new operations();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int first_num = sc.nextInt();
        System.out.print("Enter the second number:");
        int second_num = sc.nextInt();
        System.out.print(op.add(first_num, second_num));
        // System.out.print(op.sub(first_num, second_num)); cannot access since it is private
        // System.out.print(op.mul(first_num, second_num)); cannot access since it is protected
        // System.out.print(op.div(first_num, second_num)); cannot access since it is default


    }
}
