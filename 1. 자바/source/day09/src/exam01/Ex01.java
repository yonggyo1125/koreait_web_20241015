package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "이이름", "수학");
        Student s2 = new Student(1001, "김이름", "영어");

        s1.showInfo();
        s2.showInfo();
    }
}
