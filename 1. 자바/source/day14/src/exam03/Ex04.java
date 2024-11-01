package exam03;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        // 자동으로 자원해제 (close() 자동 호출)

        /**
         * 자원 해제가 필요한 객체임을 판단하는 기준 - AutoClosable 인터페이스의 구현 여부
         * 내부 코드
         * AutoClosable auto = fis; // 형변환 되면 - 자동해제 가능, 아니면 - 해제 불가한 객체
         * 형변환 된다(기준 충족)  auto.close() 자동 호출 - try ~ ... 로직이 종료 되면
         */
        try (FileInputStream fis = new FileInputStream("a.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
