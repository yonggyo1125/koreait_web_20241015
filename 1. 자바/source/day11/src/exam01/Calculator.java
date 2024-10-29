package exam01;

public abstract class Calculator { // 추상클래스

     int num1 = 10; // 인스턴스 변수

     public Calculator() {
          System.out.println("Calculator 생성자!");
     }

     public void method() {
          System.out.println("하위 클래스가 공유할 공통적인 메서드!");
     }

     public abstract int add(int num1, int num2); // 추상 메서드, 설계 도구, 인스턴스 메서드
}
