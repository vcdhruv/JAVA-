import java.util.Scanner;
public class Pronic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = sc.nextInt();
        int temp,flag=0;
        temp=n;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0 && i*(i+1)==temp){
                flag=1;
            }
        }
        if(flag==1||temp==0){
            System.out.print("PRONIC");
        }
        else{
            System.out.print("NOT PRONIC");
        }
    }
}