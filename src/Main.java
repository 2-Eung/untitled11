class Outer {
    private class HiddenInner {                         // 외부에 숨기기위한것
        void secret() {
            System.out.println("private!");
        }
    }

    public void reveal() {
        HiddenInner hi = new HiddenInner();
        hi.secret();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();

    }
}