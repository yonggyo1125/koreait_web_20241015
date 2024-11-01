package exam01;

public class Ex01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result = num1 / num2; // ArithmeticException
        System.out.println(result);

        String str = null;
        str = str.toUpperCase(); // NullPointException
    }
}
