public class R03_NUM09_J {
    public static void main(String[] args) {

        for (int count = 1; count <= 10; count += 1) {
            float x = count / 10.0f;
            System.out.println(x);
        }

    }
}

// https://wiki.sei.cmu.edu/confluence/display/java/NUM09-J.+Do+not+use+floating-point+variables+as+loop+counters
