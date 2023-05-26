public class single_dimensional_array {
    public static void main(String[] args) {
        // ages will be stored in stack and will have base address , array will be stored in heap memory...
        int[] ages = new int[3];

        // ages = {1,2,3,4,5}; this cannot be done

        ages[0] = 21;
        ages[1] = 11;

        String[] names = {"v","c","d"};
        
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        // for loop traversing

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // for-each loop traversing

        for (int age : ages) {
            System.out.println(age);
        }
    }
}
