public class num_pattern12 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            int k = i;
            for (int j = 0; j < 5; j++) {
                if (k<10) {
                    System.out.print(k+"  ");
                }else{
                    System.out.print(k+" ");
                }
                k+=5;
            }
            System.out.println();
        }
    }
}
