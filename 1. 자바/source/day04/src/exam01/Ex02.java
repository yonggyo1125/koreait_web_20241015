package exam01;

public class Ex02 {
    public static void main(String[] args) {
        /*
        int num = 1; // 증가하는 수
        int total = 0; // 더해지는 합
         */

        int num = 1, total = 0;

        while (num <= 100) {
            //total = total + num;
            total += num;

            //num = num + 1; // 1씩 증가
            num++;
        }

        System.out.println(total);
    }
}
