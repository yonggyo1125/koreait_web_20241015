package exam05;

public class Outer {

    class Inner { // 인스턴스 내부 클래스

        public void method() {
            System.out.println("Inner 클래스에 정의된 메서드!");
        }
    }
}
