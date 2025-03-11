package day4.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//SOURCE는 진짜 주석
//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME) // 어노테이션 안의 정보를 어느 시점까지 살릴 건지 설정할 수 있다.
// @Documented // 자바 독스에 어노테이션을 포함할건지 물어보는 것
@Target({ElementType.TYPE, ElementType.METHOD}) // 이 어노테이션을 어디에 적용시킬 건지 제한을 둘 수 있다.
public @interface Apple {
    // annotation 이란, 컴퓨터가 이해할 수 있는 특별한 주석

    String value() default ""; // 꼭 안 받아도 될 때 default로 둔다
    int range();


}
