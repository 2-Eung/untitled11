
public class Main {             // Outer class
    private String message = "Hello from the outer class";

    class InnerMain {           // Inner class
        void displayMessage() {
            System.out.println("Inner says : " + message); // Outer 와 같은 클래스처럼 여겨져 private 도 접근 가능
        }
    }

    public void callInner() {                   // main에 안쓰고 왜 callInner 를 따로 만든거거지?
        InnerMain inner = new InnerMain();      // static 을 쓴다면 이거 없이도 가능할까???
        inner.displayMessage();
    }


    public static void main(String[] args) {
        Main outer = new Main();                // 왜 Main 이 생략안되지???
        outer.callInner();
    }
}