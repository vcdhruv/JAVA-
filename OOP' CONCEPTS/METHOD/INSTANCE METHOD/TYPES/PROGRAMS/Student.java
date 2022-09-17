public class Student{
    private int roll;
    private String name;
    public int getroll()
    {
        return roll;
    }
    public void setroll(int roll)
    {
        this.roll = roll;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name = name;
    }
    public void display(){
        System.out.println(roll + " " + name);  
    }
    public static void main(String[] args){
        Student sc = new Student();
        sc.getroll();
        sc.setroll(101);
        sc.getname();
        sc.setname("vcdf");
        sc.display();
    }
}