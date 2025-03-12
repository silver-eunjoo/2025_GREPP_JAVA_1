package day7.examples.s0.inner;

public class NoPowerException extends Exception{

    public NoPowerException() {
        super();
    }

    public NoPowerException(String message) {
        super(message);
    }

    public NoPowerException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoPowerException(Throwable cause) {
        super(cause);
    }
}
