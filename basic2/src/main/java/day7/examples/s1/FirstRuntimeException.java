package day7.examples.s1;

public class FirstRuntimeException extends RuntimeException{

    public FirstRuntimeException() {
        super();
    }

    public FirstRuntimeException(String message) {
        super(message);
    }

    public FirstRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public FirstRuntimeException(Throwable cause) {
        super(cause);
    }
}
