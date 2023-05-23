public class pyr_pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {

            // printing r-i spaces
            for (int k = 1; k <= (4-i); k++) {
                System.out.print(" ");
            }

            // printing (2*i)-1 stars
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
