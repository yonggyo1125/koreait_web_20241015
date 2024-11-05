package exam04;

public class Box<T> {
    private T item;

    // 정적 변수는 처음부터 공간을 할당 받으므로 처음부터 공간의 크기를 알필요 있음!
    // 정적 변수는 자료형을 명시하는게 필수!(지네릭 타입 사용 불가)
    //private static T item2;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
