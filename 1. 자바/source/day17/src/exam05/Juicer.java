package exam05;

import java.util.List;

public class Juicer {

    public static void make(FruitBox<Apple> appleBox) {
        List<Apple> items = appleBox.getItems();
        System.out.println(items);
    }
}
