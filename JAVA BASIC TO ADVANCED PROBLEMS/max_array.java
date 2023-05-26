import java.util.Scanner;

import ArrayOperations.*;
public class max_array {
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        Scanner sc = new Scanner(System.in);
        System.out.print("You want to find maximum of how many numbers:");
        int n = sc.nextInt();
        int[] elements = new int[n];
        ao.inputArray(elements);
        System.out.println("Maximum number is:"+ao.maxNumber(elements));
        ao.printArray(elements);
        
    }
}
