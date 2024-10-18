package exam01;

public class Ex06 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                continue; // 짝수일때 반복 건너띄기
            }

            total += i; // 홀수만 더해진다.

            /*
            if (i % 2 == 1) { // 홀수일때 더하기
                total += i;
            } */
        }

        System.out.println(total);
    }
}
