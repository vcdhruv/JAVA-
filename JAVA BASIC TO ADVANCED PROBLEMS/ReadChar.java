import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a word to get its first letter:");
        char word = sc.next().charAt(0);
        System.out.print("Character is:"+word);
    }
}
