class A{
    int a;
    int b;
    A(int x , int y){
        a = x;
        b = y;
        System.out.println("x:"+a+" y:"+b);
    }
}

public class parameterized_constructor {
    public static void main(String[] args) {
        A a = new A(4,5);
        A b = new A(7,7);
    }
}
