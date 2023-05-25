public class formal_actual_parameters {

    // formal parameters
    static int sum(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {
        // actual parameters
        System.out.print("sum of two numbers is :" + sum(4, 5));
    }
}
