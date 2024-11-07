package exam01;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE, FIELD, METHOD, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    String value() default "값1"; // 기본 설정
    int max() default 100;
    int[] numbers() default { 10, 20 };
}
