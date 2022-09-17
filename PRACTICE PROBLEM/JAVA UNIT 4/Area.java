import java.lang.Math;
class Circle{
    double radius;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    public double area(){
        double area = Math.PI*radius*radius;
        return area;
    }
}
public class Area{
    public static void main(String[] args){
        Circle c = new Circle();
        c.setRadius(2);
        System.out.println("Area of circle is:"+c.area());
    }
}