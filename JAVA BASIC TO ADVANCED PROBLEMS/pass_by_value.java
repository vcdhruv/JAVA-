public class pass_by_value {

    static void changeValue(int a){
        a *= 100;
        System.out.println("Inside changeValue() :"+a);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before changing value :" + a);
        changeValue(a);
        System.out.println("After changing value :" + a);
        changeValue(20);

    }
}
