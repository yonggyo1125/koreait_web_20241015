package exam01;

public class Ex09 {
    public static void main(String[] args) {
        int num = 10;
        boolean result1 = num++ > 10 || (num = num + 20) >= 20;

        System.out.println(result1);
        System.out.println(num);
    }
}
