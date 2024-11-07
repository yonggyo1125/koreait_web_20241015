package exam01;

import java.lang.reflect.Method;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        Class<Person> cls = Person.class;
        MyAnno myAnno = cls.getAnnotation(MyAnno.class);
        String value = myAnno.value();
        System.out.println(value);

        Method method = cls.getMethod("method", String.class);
        MyAnno myAnno2 = method.getAnnotation(MyAnno.class);
        String value2 = myAnno2.value();
        System.out.println(value2);
    }
}
