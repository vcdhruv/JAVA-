import java.util.*;
public class Hcf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number:");
        int n1 = sc.nextInt();
        System.out.print("enter 2nd number:");
        int n2 = sc.nextInt();

        int a,b,hcf;
        if(n2>n1){
            a=n2;
            b=n1;
        }
        else{
            b=n2;
            a=n1;
        }
        /*HCF IS HIGHEST COMMON FACTOR OF TWO NUMBERS.....
         * EG: 4 AND 6
         * LOGIC
         * 1)RANGE:LEAST NUMBER TO MIN(A,B)
         * 2)DECREAMENT BY ONE
         */
        for(hcf=(a<b?a:b);hcf>=1;hcf--){
            if((a%hcf==0)&&(b%hcf==0)){
                break;
            }
        }
        System.out.print("HCF OF "+a+" AND "+b+" IS:"+hcf);
     }
}
