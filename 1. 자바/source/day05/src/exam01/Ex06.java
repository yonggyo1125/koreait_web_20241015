package exam01;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80};

        System.out.printf("nums.length=%d%n", nums.length); // 배열 공간의 갯수

        for (int i = 0; i < nums.length; i++) { // 관례적으로 많이 사용
            System.out.println(nums[i]);
        }

        /*
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.println(nums[i]);
        }
        */
        /*
        for (int i = 0; i <= 3; i++) {
            System.out.println(nums[i]);
        } */
    }
}
