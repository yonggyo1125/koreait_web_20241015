package exam01;

public class Ex08 {
    public static void main(String[] args) {
        // JDK17 - instanceof 사용하는 경우, 많은 경우가 하위 클래스로 형변환하기 전에 체크해볼때
        A ac = new C();

        if (ac instanceof C c) {

        }

        if (ac instanceof C) {
            C c1 = (C) ac;
        }
    }
}
