class A{
    static int called;
    A(){
        System.out.println("default constructor called "+called);
        called++;
    }
}

public class default_constructor {
    public static void main(String[] args) {
        A a = new A();
        A s = new A();
        A d = new A();
    }
}
