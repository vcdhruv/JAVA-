class Student{
    int id; // instance variable which is in the class but outside the main method
    String name;
    public static void main(String[] args){
        //creatin an object with new keyword
        Student sc = new Student();
        //accessing member through referance variable
        sc.id = 777;
        sc.name = "CMD";
        System.out.println(sc.id+" "+sc.name);
    }
}