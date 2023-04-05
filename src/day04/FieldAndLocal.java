package day04;

public class FieldAndLocal {
    int a;  // a: 필드 (초기화 안하면 기본값)

    void mm (int b) {   // b: 매개변수
        int c;          // c: 지역변수

        if(a > 10) {
            c = 99;
        } else if (a < 5) {
            c = -100;
        } else   // 초기화
            c = 55;

        System.out.println("a = " + a);   // 힙영역에 있어 메모리가 많기 떄문에 알아서 0초기화 됨.
        System.out.println("b = " + b);   // mm이 실행되려면 b값이 들어올 수밖에 없기 때문에 에러x
        System.out.println("c = " + c);   // 다른 대안이 없기 때문에 무조건!! 초기화 되어야 함!
    }
}
