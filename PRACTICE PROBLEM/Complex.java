class Number{
	int real;
	int imaginary;
	public Number(){
		real = 0;
		imaginary = 0;
	}
	public Number(int real , int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	public void add(Number n2){
		this.real = this.real + n2.real;
		this.imaginary = this.imaginary + n2.imaginary;
	}
}
public class Complex{
	public static void main(String[] args){
		Number n1 = new Number(1,0);
		Number n2 = new Number(2,0);
		n1.add(n2);
		System.out.print("real and imaginary numbers are: " +n1.real+ "+" +n1.imaginary+ "i");
	}
}