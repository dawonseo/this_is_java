package ch09.sec07.exam03;

public class Button {
    // 정적 중첩 인터페이스
    public static interface ClickListener {
        // 추상 메소드
        void onClick();
    }

    // 필드
    private ClickListener clickListener;

    // 메소드
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click() {
        // Button이 클릭되었을 때 실행하는 메소드 선언
        this.clickListener.onClick();
    }
}
