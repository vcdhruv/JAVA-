//example of getters and setters methods
public class Demo{
        public static void main(String[] args){
            Smartphone sp = new Smartphone();
            sp.setManufacturer("samsung");
            String name = sp.getManufacturer();
            System.out.println(name);
        }
}