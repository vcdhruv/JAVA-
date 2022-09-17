class Rectangle{
    int length;
    int width;
    void insertDimensions(int length , int width){
        this.length = length;
        this.width = width;
    }
    void displayArea(){
        System.out.println("area of rectangle is :" + (length*width));
    }
}
public class AreaOfRectangle{
    public static void main(String[] args){
        Rectangle sc = new Rectangle();
        sc.insertDimensions(10,12);
        sc.displayArea();
    }
}