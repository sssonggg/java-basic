package day07.inherit;

// 서브 클래스(자식, 하위 클래스)
public class Warrior extends Player{

     int rage;          // 분노게이지

    public Warrior() {
        this("이름없음");
    }
    public Warrior(String nickName) {
        super(nickName);   // 부모의 생성자를 부름.(저동으로 숨어있음)
        this.rage = 20;
    }


    // 전사스킬 : 파워슬래시
    public void powerSlash() {
        System.out.println("파워슬래시를 시전합니다.");

    }

    // 오버라이딩
    // 조건 : 부모의 시그니처(리턴타입, 이름, 파라미터 타입)를 똑같이 사용
    //        접근제한자는 무조건 부모보다 public 해야 함

    @Override  //  오버라이딩 검사 진행 : 오버라이드가 맞는지 확인해줌.(아니면 에러남)
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage : " + this.rage);
    }


}
