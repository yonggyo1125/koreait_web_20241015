package exam01;

public class Ex01 {
    public static void main(String[] args) {
        //SimpleCalculator cal = new SimpleCalculator();
        Calculator cal = new ProCalculator();
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
