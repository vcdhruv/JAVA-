public class num_pyr_pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            
            // printing (r-i) spaces
            for (int j = 1; j <= (5-i); j++) {
                System.out.print(" ");
            }

            // printing (1 to i) numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // printing (i-1 to 1) numbers
            for (int l = (i-1); l >=1 ; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
