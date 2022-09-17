import java.util.Scanner;
class Vowel{
    int a = 0 , e = 0 , i = 0 , o = 0 , u = 0;
    String s;
    void getDetails(){
    do{
        Scanner sc = new Scanner(System.in);
        System.out.print("enter sentence:");
        s = sc.nextLine();
        s = s.toLowerCase();
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                a++;
            }
            else if(s.charAt(i)=='e'){
                e++;
            }
            else if(s.charAt(i)=='i'){
                i++;
            }
            else if(s.charAt(i)=='o'){
                o++;
            }
            else if(s.charAt(i)=='u'){
                u++;
            }
        }
    }while(!s.equals("quit"));
    u--;
    i--;
}
    void display(){
        System.out.println("a:"+a);
        System.out.println("e:"+e);
        System.out.println("i:"+i);
        System.out.println("o:"+o);
        System.out.println("u:"+u);
    }
}
public class V{
    public static void main(String[] args){
        Vowel c = new Vowel();
        c.getDetails();
        c.display();
    }
}