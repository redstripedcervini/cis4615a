public class R06_MET05_J {
    public static void main(String[] args) {

    }
}

class SuperClass {
    public SuperClass() {
        doLogic();
    }

    public final void doLogic() {
        System.out.println("This is superclass!");
    }
}

//https://wiki.sei.cmu.edu/confluence/display/java/MET05-J.+Ensure+that+constructors+do+not+call+overridable+methods
