package day08.poly.overloading;

/*
* 오버로딩 : 하나의 클래스 안에서 같은 이름의 메서드를 여러개 선언하는 것.
*           * 반드시 매개변수의 타입, 순서, 개수(파라미터!)가 달라야 함.
*             리턴타입과 접근제한자는 관련없음.
* 오버라이딩 : 부모클래스의 메서드를 자식이 재정의하는 것.
* */
public class Over {

    // 데이터를 전달하면 데이터의 타입을 알려주는 기능
    // 이미 만들어진 오버로딩객체는 리턴타입이 달라도 다시 만들지 못함.
    // alertType(String)
    void alertType(String s) {
        System.out.println("전달된 데이터는 문자열입니다.");
    }
    // alertType(int)
    void alertType(int x) {
        System.out.println("전달된 데이터는 정수입니다.");
    }

    // alertType(int, int)
    void alertType(int x, int y) {}

    // alertType(int, String)
    void alertType(int x, String y) {}

    // alertType(String, int)
    void alertType(String y, int x) {}

}