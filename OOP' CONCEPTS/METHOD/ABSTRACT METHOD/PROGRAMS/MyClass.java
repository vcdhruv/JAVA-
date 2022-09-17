abstract class Demo{
    abstract void display();
}
public class MyClass extends Demo{
        void display(){
            System.out.println("Abstract method");
        }
        public static void main(String[] args){
            Demo sc = new MyClass();    //see this step carefully
            sc.display();
        }
}