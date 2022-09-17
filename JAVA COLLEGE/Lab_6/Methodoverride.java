class A{
	void print(){
		System.out.println("A");	
	}
}
class B extends A{
	void print(){
		System.out.println("B");
	}
}
class Methodoverride{
	public static void main(String[] args) {
		//       A a=new B();
		A a=new A();
		a.print();
		B b=new B();
		b.print();
	}
}