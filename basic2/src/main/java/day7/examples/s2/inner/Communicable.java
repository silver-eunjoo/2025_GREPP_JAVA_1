package day7.examples.s2.inner;

public interface Communicable {
    void communicate(Communicable target, String message);
    LanguageType getLanguageType();
    // 번역기
    boolean hasTranslator();
}
