public class Main {
    interface OnClickListener {
        void onClick();                                                 // innerClass의 click 에의해 오버라이딩 됨
    }

    private OnClickListener listener;                                   // 생성자 로써 변수 listener를 생성한다.

    public void setOnClickListener(OnClickListener listener) {          // 세터의 역할
        this.listener = listener;
    }
    public void click() {               // 실제 클릭이 일어나면 작동        // 만약 listener 가 0 이 아니면
        if(listener != null) {                                          // onClick(); 을 실행
            listener.onClick();
        }
    }
    private class ClickHandler implements OnClickListener {             // InnerClass 외부로부터 감추기위해
        @Override
        public void onClick() {
            System.out.println("Button was clicked!");
        }
    }
    public void simulate() {
        setOnClickListener(new ClickHandler());                         // 같은 클래스의 setOn~ 메소드를 불러오고 이 메소드는
        click();                                                        // listener 의 변수를 매개변수로 가진다.
    }

    public static void main(String[] args) {
        Main btn = new Main();

        btn.simulate();
    }
}