public class R06_MET03_J {
    public static void main(String[] args) {

    }

    public final void readSensitiveFile() {
        try {
            SecurityManager sm = System.getSecurityManager();
            if (sm != null) {  // Check for permission to read file
                sm.checkRead("/temp/tempFile");
            }
            // Access the file
        } catch (SecurityException se) {
            // Log exception
        }
    }

}

//https://wiki.sei.cmu.edu/confluence/display/java/MET03-J.+Methods+that+perform+a+security+check+must+be+declared+private+or+final
