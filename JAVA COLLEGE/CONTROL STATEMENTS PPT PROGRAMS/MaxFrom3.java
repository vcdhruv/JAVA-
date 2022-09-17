//wap to find max from 3 no.
import java.util.Scanner;
public class MaxFrom3{
    public static void main(String[] args){
        System.out.print("enetr value of no.s:");
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        String result = (n1>n2)?((n1>n3)?(+n1+" is largest"):(+n3+" is largest")):((n2>n3)?(+n2+" is largest"):(+n3+" is largest"));
        System.out.println("largest from three numbers is :" +result);
    }
}