package exam01;

public class Ex06 {
    public static void main(String[] args) {
        A ad = new D();

        A ac = new C();

        //System.out.println(ad == ac);
        if (ad instanceof D) {
            C c1 = (C) ad;
        }
    }
}
