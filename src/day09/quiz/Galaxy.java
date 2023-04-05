package day09.quiz;

public class Galaxy extends SmartPhone implements Pencil {


    @Override
    public String information() {
        this.makeCall();
        return "갤럭시는 삼성에서 만들어졌고 제원은 다음과 같다";
    }

    @Override
    public String charge() {
        this.touchDisplay();
        return "고속충전, 고속 무선 충전";
    }

    @Override
    public String takePicture() {
       this.bluetoothPen();
        return "1300만 듀얼카메라";
    }

    @Override
    public String makeCall() {
        this.takeCall();
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        this.takePicture();
        return "전화받기 버튼을 누름";
    }

    @Override
    public boolean bluetoothPen() {
        this.touchDisplay();
        return true;
    }

    @Override
    public String touchDisplay() {
        return "정전식, 와콤펜 지원";
    }
}
