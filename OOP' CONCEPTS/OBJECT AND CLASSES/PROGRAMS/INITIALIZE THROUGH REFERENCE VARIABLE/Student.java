class Student{
    int id;
    String name;
    public static void main(String[] args){
        Student sc = new Student();
        Student sc1 = new Student();
        sc.id = 101;
        sc.name = "sjdahfjka";
        sc1.id = 102;
        sc1.name = "sfgdahdf";
        System.out.println(sc.id + " " + sc.name);
        System.out.println(sc1.id + " " + sc1.name);
    }
}
