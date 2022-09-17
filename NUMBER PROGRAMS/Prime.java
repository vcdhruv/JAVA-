import java.util.*;
public class Prime{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter any number:");
    int n = sc.nextInt();
    int temp=n,flag=0;
    for(int i=2;i<n;i++){
        if(n-i==i&&n-i!=0){
            flag=1;
        }
    }
    if(flag==0){
        System.out.print("PRIME");
    }
    else{
        System.out.print("NOT PRIME");
    }
}
}