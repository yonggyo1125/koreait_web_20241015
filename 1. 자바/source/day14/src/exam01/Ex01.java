package exam01;

public class Ex01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        try {
            int result = num1 / num2; // ArithmeticException
            System.out.println(result);

            String str = null;
            str = str.toUpperCase(); // NullPointException

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (NullPointerException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("계속 실행...");
    }
}
