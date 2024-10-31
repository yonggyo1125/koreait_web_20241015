package exam04;

public class Outer {
    void method() {
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num1;
            }
        };

        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
