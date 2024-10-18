package exam01;

public class Ex03 {
    public static void main(String[] args) {
        int num = 1, total = 0;
        // num : 증가하는 수, total - 증가하는 수를 더한 값

        do {
            total += num;
            num++;

        } while (num < 1);

        System.out.println(total);

    }
}
