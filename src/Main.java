class Car {
    String brand;
    Engine engine;                          // innerClass 접근 가능

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine();         // Car 인스턴스를 생성하게되면 innerClass 의 인스턴스도 동시에 생성하고
    }                                       // 이때 엔진을 끼워넣는다.

    class Engine {
        public void start() {
            System.out.println("The engine of " + brand + " is starting.");
        }
    }

    public void startEngine() {         // 이거 할때마다 새 엔진으로 갈아끼운다 <-- 이해하기
//      Engine engine = new Engine();   // 엔진이 시작할때마다 엔진을 생성한다
        engine.start();
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car("빠른자동차");

        car.startEngine();
    }
}