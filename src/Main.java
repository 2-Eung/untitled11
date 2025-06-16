class Outer {
    static class StaticInner {
        void hello() {
            System.out.println("Hi!");
        }
    }
}





public class Main {

    public static void main(String[] args) {
//      Outer outer = new Outer();                              // inner 에 static 이 없으면 이렇게
//      Outer.StaticInner inner = outer.new StaticInner();      // inner 에 static 이 없으면 이렇게

        Outer.StaticInner inner = new Outer.StaticInner();      // 있다면 이렇게
        inner.hello();
    }
}