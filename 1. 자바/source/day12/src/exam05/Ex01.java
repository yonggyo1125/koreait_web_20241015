package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner(); // Outer 클래스로 객체를 생성한 이후 객체를 생성할 수 있다!
        in.method();
    }
}
