public class PosNegZero{
    public static void main(String[] args){
        int number = 0;
        if(number > 0){
            System.out.println("positive number");
        }
        else if(number < 0){
            System.out.println("negative number");
        }
        else if(number == 0){           // == is necessary otherwise it will give error that int cannot be converted to boolean.
            System.out.println("zero");
        }
    }
}