public class multi_dimensional_array {
    public static void main(String[] args) {
        int[][] ages = new int[2][2];

        ages[0][0] = 12;
        ages[0][1] = 13;
        ages[1][0] = 14;
        ages[1][1] = 15;

        System.out.println(ages[0][0]);
        System.out.println(ages[0][1]);
        System.out.println(ages[1][0]);
        System.out.println(ages[1][1]);
        // System.out.println(ages[2][2]); IndexOutOfBound



        String[][] names = {{"vishmay","dhruv"},{"chetan","dhruv"}};

        // for loop traversing

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                System.out.print(names[i][j]+" ");
            }
            System.out.println();
        }

        // for-each loop traversing

        for (int[] age : ages) {
            for (int ag1 : age) {
                System.out.print(ag1+" ");
            }
            System.out.println();
        }
    }
}
