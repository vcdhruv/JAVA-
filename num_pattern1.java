public class num_pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {

            // printing i to rows
            for (int j = i; j <= 7; j++) {
                System.out.print(j+" ");
            }

            // printing 1 to (i-1)
            for (int k = 1; k <= (i-1); k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
