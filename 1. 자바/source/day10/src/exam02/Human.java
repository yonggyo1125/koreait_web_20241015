package exam02;

public class Human extends Animal {
    @Override
    public void move() {
        System.out.println("두 발로 직립보행!");
    }

    public void reading() {
        System.out.println("독서를 한다!");
    }

    /*
    @Override
    public void move() { // 메서드 재정의
        System.out.println("두 발로 직립보행!");
    } */
}
