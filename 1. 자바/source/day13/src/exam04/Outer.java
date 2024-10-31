package exam04;

public class Outer {
    public Calculator method(int num3) {
        Calculator cal2 = new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2 + num3;
            }
        };

        return cal2;

        //int result = cal.add(10, 20);
        //System.out.println(result);
    }
}
