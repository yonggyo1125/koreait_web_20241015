package exam02;

public class Student {
    int id; // 학번
    String name; // 학생명
    String major; // 전공과목

    public Student() { // 기본 생성자
        // 객체 생성 완료 이후 실행 코드
        // 객체 생성 완료 -> 변수 정의 -> 인스턴스 변수 생성 완료 상태
        // 인스턴스 변수 초기화 작업을 주로 진행
        id = 1000;
        name = "이이름";
        major = "수학";

    }

    public Student(int _id, String _name, String _major) {
        id = _id;
        name = _name;
        major = _major;
    }

    void showInfo() {
        System.out.printf("id=%d, name=%s, major=%s%n", id, name, major);
    }
}
