package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Schedule s1 = new Schedule();
        s1.year = 2024;
        s1.month = 2;
        s1.day = 31; // 통제가 불가

        s1.showDate();
    }
}
