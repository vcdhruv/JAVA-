class Key{
	static int count = 0;
	public Key(){
		count++;
	}
	public void display(){
		System.out.print("no. of objects are:" +count);
	}
}
public class Stat{
	public static void main(String[] args){
		Key n1 = new Key();
		Key n2 = new Key();
		Key n3 = new Key();
		Key n4 = new Key();
		Key n5 = new Key();
		n1.display();
	}
}