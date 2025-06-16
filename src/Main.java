class Person{
    int a = 1;                      // 인스턴스 변수
    static int b = 2;               // static 변수



    public static void greet() {
        System.out.println("sadfasd");

//      System.out.println(a);      // static 함수 에서는 인스턴스 변수에 접근 불가 왜??
                                    // static 변수 는 클래스를 로드할때 호출되지만 인스턴스 변수는 인스턴스가 생성될때 호출되어
                                    // 이 시점에서는 아직 인스턴스 변수가 존재하지 않는다!
        System.out.println(b);
    }

    public void sayHello() {
        System.out.println("Hello");

        System.out.println(a);      // 인스턴스 함수니까 접근 가능
        System.out.println(b);
    }
}
public class Main {
    public static void main(String[] args) {
        Person.greet();

        Person p = new Person();    // static 만 있을경우 노란줄로 경고메세지의 의미는???
        p.greet();                  // 어짜피 객체 생성해도 같은결과?? 를 만들어내니까 의미가없다라는뜻????
        p.sayHello();

    }
}