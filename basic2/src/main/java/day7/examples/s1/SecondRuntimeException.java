package day7.examples.s1;

public class SecondRuntimeException extends RuntimeException{

    public SecondRuntimeException() {
        super();
    }

    public SecondRuntimeException(String message) {
        super(message);
    }

    public SecondRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SecondRuntimeException(Throwable cause) {
        super(cause);
    }
}
