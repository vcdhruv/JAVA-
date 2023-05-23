import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter any decimal number:");
        int decimal=sc.nextInt();
        while (decimal!=1) {
            int remainder = decimal % 2;
            list.add(remainder);
            decimal/=2;
        }
        list.add(decimal);
        // Collections.reverse(list);
        // String result = list.toString();
        // System.out.print(result);
        String result = "";
        for (int i = list.size()-1; i >= 0; i--) {
            result += list.remove(i);
        }
        System.out.println(Integer.parseInt(result));
    }
}
