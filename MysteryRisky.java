/**
 * Question Two - Part (a) and (b)
 * Demonstrates how try/catch/finally with return statements behave at runtime.
 */
public class MysteryRisky {

    static int mystery() {
        try {
            System.out.println("A");
            return 1;
        } catch (Exception e) {
            System.out.println("B");
            return 2;
        } finally {
            System.out.println("C");
            return 3; // overrides any pending return value from try/catch
        }
    }

    static int risky(int x) {
        try {
            if (x == 0) throw new ArithmeticException();
            return 10 / x;
        } catch (ArithmeticException e) {
            System.out.println("caught");
            return -1;
        } finally {
            System.out.println("done");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- mystery() ---");
        // caller:
        System.out.println(mystery());

        System.out.println("\n--- risky(0) ---");
        int r0 = risky(0);
        System.out.println("Returned: " + r0);

        System.out.println("\n--- risky(2) ---");
        int r2 = risky(2);
        System.out.println("Returned: " + r2);
    }
}
