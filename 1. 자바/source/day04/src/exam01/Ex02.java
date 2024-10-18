package exam01;

public class Ex02 {
    public static void main(String[] args) {
        /*
        int num = 1; // 증가하는 수
        int total = 0; // 더해지는 합
         */

        int num = 1; // 초기값, 초기화식;
        int total = 0;

        while (num <= 100) { // 조건식
            //total = total + num;
            total += num;

            //num = num + 1; // 1씩 증가
            num++; // 증감식(증가 또는 감소)
        }

        // 초기값, 조건식, 증감식 - 횟수가 있는 반복문에서 필수 요소!
        System.out.println(total);
    }
}
