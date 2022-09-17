import java.util.Scanner;
public class Fascinating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any number:");
        int n = sc.nextInt();
        String sum = Integer.toString(n);
        sum = "";
        int mul,noOfDigits=0,x;
        int temp;
        temp=n;
        while(n!=0){
            x = n%10;
            noOfDigits++;
            n = n/10;
        }
        System.out.println("No. after iteration is:"+n);
        System.out.println("Temporary variable is:"+temp);
        System.out.println("No. of digits is:"+noOfDigits);
       /* */ for(int i=1;i<=noOfDigits;i++){
            mul = temp*i;
            String m = Integer.toString(mul); 
            sum = sum + m;
        }
        System.out.print("sum is:"+sum);
        System.out.println();
        char str[] = sum.toCharArray();
        int count,flag=0;
        for(int j=0;j<str.length;j++){
            count=1;
            for(int k=j+1;k<str.length;k++){
                if (str[j]==str[k]) {
                    count++;
                    str[k]='0';
                }
            }
            System.out.println(count);
            if (count>1&&str[j]!='0') {
                flag=1;
            }
        }
        if (flag==1) {
            System.out.println(temp+" is not FASCINATING NO.");
        } else {
            System.out.println(temp+" is FASCINATING NO.");
        }
    }
}
