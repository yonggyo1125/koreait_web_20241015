package exam05;

import java.util.List;

public class Juicer {
    // 와일드 카드
    public static void make(FruitBox<?> fruitBox) {
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }
    /*
    public static void make(FruitBox<Grape> grapeBox)  // 메서드 중복 정의{
        List<Grape> items = grapeBox.getItems();
        System.out.println(items);
    } */
}
