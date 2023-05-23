public class num_pyr_pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {

            // printing (r-i) spaces
            for (int j = 1; j <= (4-i); j++) {
                System.out.print(" ");
            }

            // printing numbers
            for (int k = 1; k <= (2*i-1); k++) {
                if(k==1 || i==4 || k==(2*i-1)){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
