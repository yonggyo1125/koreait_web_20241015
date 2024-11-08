package exam03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        HashMap<String, String> members = new HashMap<>();
        members.put("user04", "사용자04");
        members.put("user05", "사용자05");
        members.put("user06", "사용자06");
        members.put("user07", "사용자07");
        members.put("user01", "사용자01");
        members.put("user02", "사용자02");
        members.put("user03", "사용자03");

        Set<Map.Entry<String, String>> entries = members.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("key=%s, value=%s%n", key, value);
        }
    }
}
