package day7.examples.s2.exception;

public class AmbiguousVocaException extends RuntimeException{
    public AmbiguousVocaException() {
        super();
    }

    public AmbiguousVocaException(String message) {
        super(message);
    }

    public AmbiguousVocaException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmbiguousVocaException(Throwable cause) {
        super(cause);
    }
}
