package exam04;

public class Outer {
    public Calculator method() {
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        return cal;

        //int result = cal.add(10, 20);
        //System.out.println(result);
    }
}
