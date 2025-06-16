interface Calculator {
    int compute(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Calculator sum = new Calculator() {             // 인스턴스 생성
            @Override
            public int compute(int a, int b) {          // 그와 동시에 구현
                return a + b;
            }
        };
        Calculator sub = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a - b;
            }
        };
        Calculator mul = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a * b;
            }
        };
        Calculator nng = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a / b;
            }
        };
        Calculator mulmul = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return a * a * b * b;
            }
        };
        Calculator connectNum = new Calculator() {
            @Override
            public int compute(int a, int b) {
                return Integer.parseInt(""+ a + b);
            }
        };
        System.out.println(sum.compute(3,4));
        System.out.println(sub.compute(3,4));
        System.out.println(mul.compute(3,4));
        System.out.println(nng.compute(3,4));
        System.out.println(mulmul.compute(3,4));
        System.out.println(connectNum.compute(3,4));
    }
}