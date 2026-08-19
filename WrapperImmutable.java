public class WrapperImmutable {
    public static void main(String[] args) {

        // Integer is a wrapper class
        Integer a = 10;

        System.out.println("Before modification:");
        System.out.println("a = " + a);

        // Changing the value creates a new Integer object
        a = a + 20;

        System.out.println("After modification:");
        System.out.println("a = " + a);

        // Demonstrating with String-like immutability
        Integer b = 50;
        Integer c = b;

        b = 100;

        System.out.println("\nWrapper Class Immutability:");
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
