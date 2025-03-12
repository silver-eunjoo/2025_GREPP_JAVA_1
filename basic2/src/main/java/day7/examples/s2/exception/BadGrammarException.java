package day7.examples.s2.exception;

public class BadGrammarException extends RuntimeException{
    public BadGrammarException() {
        super();
    }

    public BadGrammarException(String message) {
        super(message);
    }

    public BadGrammarException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadGrammarException(Throwable cause) {
        super(cause);
    }
}
