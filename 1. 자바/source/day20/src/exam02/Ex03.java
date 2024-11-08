package exam02;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class Ex03 {
    public static void main(String[] args) {
        //TreeSet<String> items = new TreeSet<>();
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // 내림차순 정렬
            }
        };

        //TreeSet<String> items = new TreeSet<>(comp);
        TreeSet<String> items = new TreeSet<>(Comparator.reverseOrder());
        items.add("이름1");
        items.add("이름3");
        items.add("이름4");
        items.add("이름5");
        items.add("이름2");
        items.add("이름2");
        items.add("이름2");

        System.out.println(items);
    }
}
