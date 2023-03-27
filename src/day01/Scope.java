package day01;

public class Scope {    // 파스칼문자(클래스 이름 :   대제목 - 첫번째 대문자)
    public static void main(String[] args) {

        int userNumber = 1010;

        // 자바는 블록단위 스코프를 가짐
        int n1 = 10;
        int n2 = 20; // mian 블록에서 생성된 변수

        if (true) {
            int n3 = n1 + n2;
            System.out.println(n3);
        }
    } // end main
        int i;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        } // end for
//        int n4 = i + 10;

//    int n3 = n1 + n2;  main이 끝났으므로 안됨
}
