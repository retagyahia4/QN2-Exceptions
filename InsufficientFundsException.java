/**
 * Question Two - Part (c)
 * Custom CHECKED exception (extends Exception, not RuntimeException),
 * so callers are forced by the compiler to catch it or declare it.
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
