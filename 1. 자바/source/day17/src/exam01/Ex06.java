package exam01;

public class Ex06 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = Integer.valueOf(1000);

        System.out.printf("num1 주소: %d%n", System.identityHashCode(num1));
        System.out.printf("num2 주소: %d%n", System.identityHashCode(num2));
    }
}
