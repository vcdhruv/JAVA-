import java.util.Scanner;
public class CountVowel{
	public static void main(String[] args){
		int vowel=0;
		String s;
	do{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any senetnce:");
		s = sc.nextLine();
		s = s.toUpperCase();
		for(int i = 0;i<s.length();i++){
			char c = s.charAt(i);
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
				vowel++;
			}
		}
	}while(!s.equals("QUIT"));
	System.out.print("vowels are : " + (vowel-2));
	}
}