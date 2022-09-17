import java.io.BufferedReader;
import java.io.FileReader;
public class FileTester{
    public static void main(String[] args){
        int l=0,w=0,c=0;
        try{
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        String line=br.readLine();
        while(line!=null){
            l++;
            String[] words=line.split(" ");
            w = w + words.length;
            for(String word:words){
                c = c + word.length();
            }
            line=br.readLine();
        }
    }catch(Exception e){
        
    }
        System.out.println("line:"+l+"words:"+w+"characters:"+c);
    }
}