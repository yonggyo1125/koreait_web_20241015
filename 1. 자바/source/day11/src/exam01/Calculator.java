package exam01;

public abstract class Calculator { // 추상클래스


     public Calculator() {
          System.out.println("Calculator 생성자!");
     }

     public abstract int add(int num1, int num2); // 추상 메서드, 설계 도구
}
