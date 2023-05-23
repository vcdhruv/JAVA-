public class BitwiseOp {
    public static void main(String[] args) {
        System.out.println("Bitwise OR : ONE TRUE THEN TRUE  ");
        System.out.println("true || true = "+(true || true));
        System.out.println("true || false = "+(true || false));
        System.out.println("false || true = "+(false || true));
        System.out.println("false || false = "+(false || false));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Bitwise AND : ONE FALSE THEN FALSE  ");
        System.out.println("true && true = "+(true && true));
        System.out.println("true && false = "+(true && false));
        System.out.println("false && true = "+(false && true));
        System.out.println("false && false = "+(false && false));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Bitwise EXCLUSIVE OR : BOTH SAME THEN FALSE   ");
        System.out.println("true ^ true = "+(true ^ true));
        System.out.println("true ^ false = "+(true ^ false));
        System.out.println("false ^ true = "+(false ^ true));
        System.out.println("false ^ false = "+(false ^ false));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Bitwise COMPLEMENT : IT INVERTS ALL THE BITS NO IT DOES ONE'S COMPLEMENT OF A NUMBER AND ONE AND A NEGATIVE SIGN AND VICE VERSA   ");
        System.out.println("~true = "+(~1));
        System.out.println("~false = "+(~0));
        System.out.println("BITWISE LEFT SHIFT OPERATOR : LEFT SHIFT AND ADD ZERO TO RIGHT SHIFTED BIT");
        System.out.println("9(1001) << 1 = "+(9<<1));
        System.out.println("BITWISE Right SHIFT OPERATOR : SHIFT BIT TO RIGHT");
        System.out.println("9(1001) << 1 = "+(9>>1));
        System.out.println("TRICK : a << b = a * 2 raise to b");
        System.out.println("TRICK : a >> b = a / 2 raise to b");
    }
}
