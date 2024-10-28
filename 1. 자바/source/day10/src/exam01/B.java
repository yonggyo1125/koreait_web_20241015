package exam01;

public class B extends A {
    int numB = 20;

    public B() {
        super(); // 따로 정의 안되어 있으면 컴파일러가 자동 추가! - A()
        System.out.println("B 생성자!");
    }
}
