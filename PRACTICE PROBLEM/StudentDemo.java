import java.util.Scanner;
class Student{
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code = new String[10];
    double[] subject_credits = new double[10];
    String[] grade_obtained = new String[10];
    int spi;
    double[] total = new double[10];
    int tot = 0 , crd = 0;

    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter id_no:");
        id_no = sc.nextInt();
        System.out.print("enter no_of_subjects_registered:");
        no_of_subjects_registered = sc.nextInt();
        for(int i=0;i<no_of_subjects_registered;i++)
        {
            System.out.print("enter subject_code of " + (i+1) + "  subject:");
            subject_code[i] = sc.next();
            System.out.print("enter subject_credits of " + (i+1) + " subject:");
            subject_credits[i] = sc.nextDouble();
            System.out.print("enter grade_obtained of " + (i+1) + " subject:");
            grade_obtained[i] = sc.next();
        }
    }
    public void displayDetails(){
        for(int j=0;j<no_of_subjects_registered;j++){
            System.out.print("id_no" + ":" + id_no + "no_of_subjects_registered" + ":" + no_of_subjects_registered);
            System.out.print("subject_code" + ":" + subject_code[i]);
            System.out.print("grade_obtained" + ":" + grade_obtained[i]);
            System.out.print("subject_credits" + ":" + subject_credits[i]);
        }
    }
    public Student(){
        if(grade_obtained[i].equalsIgnoreCase("aa")){
            total[i] = 10*subject_credits[i];
        if(grade_obtained[i].equalsIgnoreCase("a")){
            total[i] = 9*subject_credits[i];
        if(grade_obtained[i].equalsIgnoreCase("bb")){
            total[i] = 8*subject_credits[i];
                }
        else{
            System.out.print("fail");
            }
    for(int k=0;k<no_of_subjects_registered;k++){
        tot = tot + total[i];
        crd = crd + subject_credits[i];
    }
    }
 class StudentDemo{
    public static void main(String[] args){
        Student f = new Student();
        int no_of_subjects_registered = Integer.parseInt();
        f.getDetails();
        f.displayDetails();
    }
}