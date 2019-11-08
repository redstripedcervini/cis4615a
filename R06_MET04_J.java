public class R06_MET04_J {
    public static void main(String[] args) {

    }

}

class Super {
    protected final void doLogic() { // Declare as final
        System.out.println("Super invoked");
        // Do sensitive operations
    }
}

//https://wiki.sei.cmu.edu/confluence/display/java/MET04-J.+Do+not+increase+the+accessibility+of+overridden+or+hidden+methods
