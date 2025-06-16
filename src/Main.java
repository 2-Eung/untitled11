public class Main {
    private String data = "Outer data";

    class Inner {
        void printData() {
            System.out.println(data);
        }
    }

    public Inner createInner() {                        // 반환타입이 Inner
        return new Inner();                             // new ....
    }

    public static void main(String[] args) {
        Main outer = new Main();

        //Outer.this
        Main.Inner inner = outer.createInner();

        inner.printData();

        outer = null;                                   // outer 메모리를 날려도
        inner.printData();                              // 실행 됨

        inner = null;
//      inner.printData();                              // inner 메모리 날리면 실행 안됨
    }
}