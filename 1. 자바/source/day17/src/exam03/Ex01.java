package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Box appleBox = new Box();
        appleBox.setItem(new Apple());
        //appleBox.setItem(new Banana());






        // 타입 안정성이 확보 X
       Object obj = appleBox.getItem(); // 형변환 번거로움
        if (obj instanceof Apple apple) {
            System.out.println(apple.info());
        }
    }
}
