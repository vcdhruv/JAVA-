public class pyr_pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {

            // printing r-i spaces
            for (int j = 1; j <= (4-i); j++) {
                System.out.print("  ");
            }

            // printing (2*i)-1 stars
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}
