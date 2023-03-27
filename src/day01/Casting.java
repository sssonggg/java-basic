package day01;

public class Casting {
    public static void main(String[] args) {
        //업 캐스팅 : 작은타입에서 큰 타입으로의 대입은 문제없음
        byte a = 100;    // 1바이트타입
        int b = a;       // 4바이트타입

        // 다운 캐스팅 : 큰타입에서 작은 타입으로의 대입은 문제생길 수 있음
        // (데이터 소실의 위험성 있음)
        // c: 0011 1110 1000
        int c = 1000;           // 4바이트타입
        byte d = (byte) c;      // 1타이트타입
        System.out.println("d = " + d);

       double x = 3.5566;
//       iny y = (int) x;
//        System.out.println("y = " + y);
        
        // 타입이 다른 데이터의 연산
        // 타입이 다를 경우 큰 타입에 맞춰서 변환 후 연산 진행
        int k = 100;
        double j = 5.5;
        double v = k + j;

        char c1 = 'A';    // 2바이트   ===> int c1 = 65;
        int alpha = 1;    // 4바이트
        System.out.println(c1 + alpha);

        // int보다 작은 데이터끼리의 연산은
        // 무조건 둘다 int로 변환됨. (byte, short, char)
        char c2 = 'B';  //===> int
        char c3 = '1';  //===> int
        System.out.println(c2 + c3);

        byte b1 = 100;  //===> int
        byte b2 = 20;   //===> int

        int b3 = b1 * b2;

        System.out.println('가'+'A');   // int + int 로 변경됨.


        int g = 24;
        double result = (double) g/5;
//      double result = g/5.0;
//      double result = double) g/(double)5.0;
        System.out.println("result = " + result);


    }
}
