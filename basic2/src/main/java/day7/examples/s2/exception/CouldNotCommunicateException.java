package day7.examples.s2.exception;

public class CouldNotCommunicateException extends RuntimeException{
    public CouldNotCommunicateException() {
        super();
    }

    public CouldNotCommunicateException(String message) {
        super(message);
    }

    public CouldNotCommunicateException(String message, Throwable cause) {
        super(message, cause);
    }

    public CouldNotCommunicateException(Throwable cause) {
        super(cause);
    }
}
