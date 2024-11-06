package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Transportation trans = Transportation.BUS;
        System.out.println(trans instanceof Transportation);

        Enum<Transportation> e = trans;
    }
}
