class Rect{
    int len;
    int wid;
    boolean isFilled;
    public Rect(int l , int w , boolean i){
        l = len;
        w = wid;
        i = isFilled;
    }
}
public class Rectangle{
    public static void main(String[] args){
        Rect sc = new Rect(6,6,false);
        System.out.println(sc.len);
    }
}