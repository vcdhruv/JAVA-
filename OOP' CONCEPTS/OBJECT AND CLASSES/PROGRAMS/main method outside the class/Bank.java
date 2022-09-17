class Sbi{
    int bank_Id;
    String name;
}
//creating another class bank which contains main method
public class Bank{
    public static void main(String[] args){
        //creating object of class
        Sbi sc = new Sbi();
        int a = sc.bank_Id;
        String b = sc.name;
        //displaying member thtough referance variable
        System.out.println(a);
        System.out.println(b);
    }
}