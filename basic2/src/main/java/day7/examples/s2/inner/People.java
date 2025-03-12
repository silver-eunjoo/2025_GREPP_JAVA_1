package day7.examples.s2.inner;

import day7.examples.s2.exception.AmbiguousVocaException;
import day7.examples.s2.exception.BadGrammarException;
import day7.examples.s2.exception.CouldNotCommunicateException;

public class People implements Communicable{

    private final LanguageType motherTongue;
    private boolean hasTranslator = false;

    public People(LanguageType motherTongue) {
        this.motherTongue = motherTongue;
    }

    public People(LanguageType motherTongue, boolean hasTranslator) {
        this.motherTongue = motherTongue;
        this.hasTranslator = hasTranslator;
    }

    @Override
    public void communicate(Communicable target, String message) {

        // 단어 선택
        // 문법 선택 (문장 만들기)
        // 의사소통 불가능
        try{
            makeSentence(target);
            System.out.println("정상적으로 의사소통 가능합니다 ! " + message);
        } catch ( BadGrammarException e ) {
            throw new CouldNotCommunicateException("정상적인 의사소통이 불가능합니다.", e);
        }

    }

    @Override
    public LanguageType getLanguageType() {
        return motherTongue;
    }

    @Override
    public boolean hasTranslator() {
        return hasTranslator;
    }

    private boolean canCommunicateWith(Communicable target) {
        LanguageType targetLanguageType = target.getLanguageType();
        return this.getLanguageType().equals(targetLanguageType);
    }

    private void makeSentence(Communicable target) throws BadGrammarException{
        try {
            choiceVoca(target);
            System.out.println("적절한 문장을 만들었습니다!");
        } catch (AmbiguousVocaException e) {
            throw new BadGrammarException("문법적으로 옳지 않은 문장을 만들기 시작합니다.", e);
        }
    }

    private void choiceVoca (Communicable target) throws AmbiguousVocaException{
        if(!canCommunicateWith(target)) {
            throw new AmbiguousVocaException("모호한 단어를 선택해서 이야기를 시작합니다.");
        }

        System.out.println("적절한 단어를 선택했습니다!");

    }

}
