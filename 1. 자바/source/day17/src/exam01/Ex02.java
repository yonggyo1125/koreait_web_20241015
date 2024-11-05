package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Integer num1 = 100; // int 100 - 자료형이 같지 않으므로 원칙상 대입    불가
        // Integer num1 = Integer.valueOf(100); 컴파일러가 자동 변환
        Integer num2 = 200; // 오토 박싱 - 성능 저하!

        Integer num3 = num1 + num2; // 객체간의 연산 불가! 기본 자료형만 연산 가능! - 언박싱, 오토박싱  - 성능 저하!
        /**
         * 컴파일러가 자동 변화
         * num1.intValue() -> int (기본형)
         * num2.intValue() -> int (기본형)
         *
         * Integer num3 = Integer.valueOf(....);
         */

        System.out.println(num3);
    }
}
