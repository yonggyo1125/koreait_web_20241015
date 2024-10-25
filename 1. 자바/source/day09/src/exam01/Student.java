package exam01;

public class Student {
    static int id; // 학번, 정적 변수(데이터 영역 할당)
    String name; // 학생명
    String major; // 전공

    public Student(int id, String name, String major) {
        //this.id = id;
        Student.id = id;
        this.name = name;
        this.major = major;
    }

    public void showInfo() {
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
        staticMethod();
    }

    public static void staticMethod() {
        System.out.println("정적 메서드!");
        //this.name - 객체의 자원은 접근 불가(인스턴스 변수, 인스턴스 메서드 사용 불가)
       // this.showInfo();
    }
}
