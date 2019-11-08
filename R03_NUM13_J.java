public class R03_NUM13_J {
    public static void main(String[] args) {

    }
}

strictfp class WideSample {
    public static int subFloatFromInt(int op1, float op2)
            throws ArithmeticException {

        // The significand can store at most 23 bits
        if ((op2 > 0x007fffff) || (op2 < -0x800000)) {
            throw new ArithmeticException("Insufficient precision");
        }

        return op1 - (int) op2;
    }

    public static void main(String[] args) {
        int result = subFloatFromInt(1234567890, 1234567890);
        System.out.println(result);
    }
}

// https://wiki.sei.cmu.edu/confluence/display/java/NUM13-J.+Avoid+loss+of+precision+when+converting+primitive+integers+to+floating-point
