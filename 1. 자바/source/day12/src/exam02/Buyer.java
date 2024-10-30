package exam02;

public interface Buyer {
    void buy();

    default void order() { // public
        System.out.println("Buyer - 주문");
        privateMethod();
    }

    private void privateMethod() { // JDK9
        System.out.println("private 메서드!");
    }

    static void staticMethod() { // public
        System.out.println("정적 메서드!");
    }
}
