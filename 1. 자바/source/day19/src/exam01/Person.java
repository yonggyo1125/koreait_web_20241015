package exam01;

@MyAnno(value="값1") // Person 클래스의 정의 일부
public class Person {

    @MyAnno(value="값2")
    private String name;

    @MyAnno(value="값3")
    public void method(@MyAnno(value="값4") String title) {

    }
}
