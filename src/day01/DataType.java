package day01;

public class DataType {

    public static void main(String[] args) {

        int a = 30000;

        
        float f1 = 1.23456789F;
        System.out.println("f1 = " + f1);

        double d1 = 1.23455453463565656;
        System.out.println("d1 = " + d1);

        // 논리타입
        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = TRUE;  대문자 안됨


        // 문자 타입 : 한글자
        char c1 = 'A';   // 아스키코드 : 65
        System.out.println(c1 + 1);   // 아스키코드x, 숫자 66출력 
        System.out.println((char)(c1 + 1));   // B출력
        
        char c2 = 44032;
        System.out.println("c2 = " + c2);


        // String은 기본타입 아닌 객체임
        String s = "hello";

        


    }
}
