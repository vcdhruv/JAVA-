import java.util.Scanner;
class Circle{
double radius;
double area;
	public double area(double radius){
		return area=Math.PI*radius*radius;
	}
	public Circle(double radius){
		this.radius=radius;
	}
	public void displayArea(){
		System.out.print("area of circle of " + radius + " is :" +area);
	}
}
public class AreaOfCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in)	;
		System.out.print("enter radius");
		double radius = sc.nextDouble();
		Circle c = new Circle(radius);
		c.area(radius);
		c.displayArea();
	}
}