public class BloodDonation{
    public static void main(String[] args){
        int age = 19;
        int weight = 80;
        if(age >= 18){
            if(weight > 50){
                System.out.println("person is eligible to donate blood");
            }
            else{
                System.out.println("person is not eligible to donate blood");
            }
        }
        else{
            System.out.println("Age must be greater than 18");
        }
    }
}