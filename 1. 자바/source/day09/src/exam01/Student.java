package exam01;

public class Student {
    static int id; // 학번, 정적 변수(데이터 영역 할당)
    String name; // 학생명
    String major; // 전공

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public void showInfo() {
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
    }
}
