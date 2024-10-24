package exam01;

import java.lang.reflect.*;

public class Ex02 {
    public static void main(String[] args) {
        Class cls = CreditCard.class; // 클래스의 구성 정보가 담겨있는 객체

        // 생성자 구성 정보
        Constructor[] constructors = cls.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
