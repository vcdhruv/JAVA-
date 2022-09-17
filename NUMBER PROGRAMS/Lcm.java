import java.util.*;
public class Lcm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st number:");
        int n1 = sc.nextInt();
        System.out.print("enter 2nd number:");
        int n2 = sc.nextInt();
        int a,b,lcm;
        if(n2>n1){
            a=n2;
            b=n1;
        }
        else{
            b=n2;
            a=n1;
        }
        /*LCM IS LEAST COMMON MULTIPLE OF TWO NUMBERS.....
         * EG: 4 AND 6
         * LOGIC
         * 1)RANGE:GREATEST NUMBER TO (4*6)
         * 2)OPERATOR CONDITION : i+GREATEST NUMBER
         */
        for(lcm=b;lcm<=(a*b);lcm++){
            if((lcm%a==0)&&(lcm%b==0)){
                break;
            }
        }
        System.out.print("LCM OF "+a+" AND "+b+" IS:"+lcm);
     }
}
