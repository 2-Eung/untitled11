class Outer {
    String outerMessage = "Hello from Outer";

    class Inner {                                   // private 를 넣으면 안된다 왜???
        void showMessage() {
            System.out.println(outerMessage);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();      // inner 인스턴스는 반드시 outer 인스턴스를 통해 생성해야 한다????

        inner.showMessage();
    }
}