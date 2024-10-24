package exam03;

public class A {
    int num1; // default 접근 제어자 - 동일 패키지 내에서만 접근 가능
    protected int num2; // 동일 패키지 내에서 접근 가능(default) + 상속을 통하면 다른 패키지더라도 클래스 내부(private)에서 접근 가능

    public int num3; // 동일 패키지, 다른 패키지 모두 접근 가능

    private int num4; // 클래스 내부에서만 접근 가능
}
