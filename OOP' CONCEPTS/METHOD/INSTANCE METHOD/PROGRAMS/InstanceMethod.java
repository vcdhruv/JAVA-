public class InstanceMethod{
    public static void main(String[] args){
        //creating an object of the class
        InstanceMethod sc = new InstanceMethod();
        int a = 1 , b = 1;
        //calling an instance method
        System.out.println(sc.add(a,b));
    }
    public int add(int n1 , int n2){
        int s = n1 + n2;
        return s;
    }
}