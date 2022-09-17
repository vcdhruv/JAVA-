class Employee{
    int id;
    String name;
    float salary;
    void insert(int id , String name , float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}
public class EmployeeInfo{
    public static void main(String[] args){
        Employee sc = new Employee();
        sc.insert(101 , "hdsj" , 5000);
        sc.display();
    }
}