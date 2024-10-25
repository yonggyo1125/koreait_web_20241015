package exam02;

public class Schedule2 {
    private int year;
    private int month;
    private int day;

    public Schedule2() {
        year = 2024;
        month = 10;
        day = 25;
    }

    public Schedule2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        // 출처가 명확하지 않은 경우 인스턴스 변수인 경우 직접 this를 사용하여 정의!
        this.day = day;
    }

    public void showDate() {
        // 변수의 출처가 인스턴스 변수로 명확한 경우 this를 생략!
        System.out.printf("year=%d, month=%d, day=%d%n", year, month, this.day);
    }

    public void printThis() {
        System.out.printf("this=%s%n", this);
        System.out.println(System.identityHashCode(this));
       // this.showDate();
        showDate();
    }

    public Schedule2 returnThis() {
        return this;
    }
}
