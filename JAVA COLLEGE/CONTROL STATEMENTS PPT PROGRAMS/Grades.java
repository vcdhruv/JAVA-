//wap to calculate division obtained by student
import java.util.Scanner;
public class Grades{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of egd:");
        int egd = sc.nextInt();
        System.out.println("enter marks of oop:");
        int oop = sc.nextInt();
        System.out.println("enter marks of maths:");
        int maths = sc.nextInt();
        System.out.println("enter marks of foe:");
        int foe = sc.nextInt();
        System.out.println("enter marks of dbms:");
        int dbms = sc.nextInt();
        int percent = ((egd + oop + maths + foe + dbms)/5)*100;
        if(percent >= 60){
            System.out.println("first division");
        }
        else if(percent >= 50 && percent <= 59){
            System.out.println("second division");
        }
        else if(percent >= 40 && percent <= 49){
            System.out.println("third division");
        }
        else if(percent < 40){
            System.out.println("fail");
        }
    }
}