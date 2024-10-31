package exam04;

public class Outer {
    public Calculator method(int num3) {

        return new Calculator() {
            public int add(int num1, int num2) {
                //num3 = 40; final num3 -> 데이터 영역 공간 할당
                // 지역 변수의 상수화 - 값을 제거하지 않을 목적
                return num1 + num2 + num3;
            }
        };



        //int result = cal.add(10, 20);
        //System.out.println(result);
    }
}
