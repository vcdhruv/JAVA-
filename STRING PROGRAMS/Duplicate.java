import java.util.Scanner;
public class Duplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();   //go at gym
        char str[] = s.toCharArray(); 
        int count;
        for(int i=0;i<str.length;i++){
            count=1;
            for(int j=i+1;j<str.length;j++){
                if((str[i]==str[j])&&(str[i]!=' ')){
                    count++;
                    str[j]='0'; //go at  0ym
                }
            }
            if(count>1&&str[i]!='0'){   //so that 0 is not repeated..
                System.out.print("duplicate characters are:"+str[i]);
                System.out.println();
            }
        }        
    }
}