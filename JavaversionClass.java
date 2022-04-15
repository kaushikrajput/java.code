public class JavaversionClass {
    public static void main(String[] args) {
        System.out.println("Java Version:" + System.getProperty("Java.version"));
        System.out.println("Java Runtime Version:" + System.getProperty("Java.runtime.version"));
        System.out.println("Java Home:" + System.getProperty("Java.home"));
        System.out.println("Java Vendor:" + System.getProperty("Java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("Java.vendor.url"));
        System.out.println("Java Class Path:" + System.getProperty("Java.class.path") + "\n");
    }

}
