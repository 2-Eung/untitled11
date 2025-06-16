interface Greeting {
    void greet();
}

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {                // Greeting 이게 anonymousClass
            @Override                                       // 원래라면 위에 클래스에 상속에 오버라이딩까지 해야하지만
            public void greet() {                           // 한번쓰고 말거여서 이렇게 한다.
                System.out.println("Hello from the anonymous class!");
            }
        };

        greeting.greet();
    }
}