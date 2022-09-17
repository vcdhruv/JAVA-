public class GradingSystem{
    public static void main(String[] args){
        int marks = 100;
        if(marks < 40){
            System.out.println("fail");
        }
        else if(marks >= 40 && marks <= 50){
            System.out.println("C Grade");
        }
        else if(marks > 50 && marks <= 60){
            System.out.println("C+ Grade");
        }
        else if(marks > 60 && marks <= 70){
            System.out.println("B Grade");
        }
        else if(marks > 70 && marks <= 80){
            System.out.println("B+ Grade");
        }
        else if(marks > 80 && marks <=90){
            System.out.println("A Grade");
        }
        else if(marks > 90 && marks <= 100){
            System.out.println("A+ Grade");
        }
        else{
            System.out.println("Invalid");
        }
    }
}