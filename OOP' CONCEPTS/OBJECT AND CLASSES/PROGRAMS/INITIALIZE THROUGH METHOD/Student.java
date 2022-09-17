class Student{
    int rollNo;
    String name;
    void insertRecord(int r,String n){
        rollNo = r;
        name = n;
    }
    void displayRecord(){
        System.out.println(rollNo+" "+name);
    }
    public static void main(String[] args){
        Student sc = new Student();
        Student sc1 = new Student();
        sc.insertRecord(111,"fgh");
        sc.displayRecord();
        sc1.insertRecord(112,"dgsaj");
        sc1.displayRecord();
    }
}