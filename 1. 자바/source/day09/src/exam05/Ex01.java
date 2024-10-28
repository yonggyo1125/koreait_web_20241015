package exam05;

public class Ex01 {
    public static void main(String[] args) {
        int result1 = add(10, 20); // int add(int, int)
        System.out.println(result1);

        int result2 = add(10, 20, 30); // int add(int, int, int)
        System.out.println(result2);
    }

    static int add(int num1, int num2) { // int add(int, int)
        int result = num1 + num2;

        return result;
    }

    static int add(int n1, int n2, int n3) { // int add(int, int, int)
        int result = n1 + n2 + n3;

        return result;
    }
}
