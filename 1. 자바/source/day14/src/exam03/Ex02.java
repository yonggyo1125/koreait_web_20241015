package exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("a.txt");

            fis.close();
            System.out.println("자원 해제 완료!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
