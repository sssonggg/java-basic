package day02;

import com.sun.security.jgss.GSSUtil;

import java.util.Locale;
import java.util.Scanner;

public class SwtichExample {

    // 자바 상수
    public static final String SPRING = "봄";
    public static void main(String[] args) {
        System.out.println("### 여행지 추천 ###");
        System.out.println("[원하는 계절을 입력하세요.]");
        System.out.print(">> ");  // 봄, 여름, 가을, 겨울

        Scanner sc = new Scanner(System.in);
       /* String season = sc.nextLine();

        // switch문에는 [정수, 문자형] 변수를 써야함.
        switch (season){
            case SPRING :
                System.out.println("봄에는 여의도를 가세요!");
                break; // switch문 탈출
            case "여름" :  case "summer" : case "SUMMER" :
                System.out.println("여름에는 홍천을 가세요!");
                break; // switch문 탈출
            case "가을" :
                System.out.println("가을에는 춘천을 가세요!");
                break; // switch문 탈출
            case "겨울" :
                System.out.println("겨울에는 스키장을 가세요!");
                break; // switch문 탈출
            default: // else와 같은 효과
                System.out.println("계절을 잘 입력하세용!");
                }*/

                System.out.println("=====================");

        System.out.println("정말로 종료합니까? [Y/N]");

        String answer = sc.nextLine();

        switch(answer.toLowerCase().charAt(0)) {
            // toLowerCase():무조건 소문자로 변환
            // charAt(인덱스):인덱스번째 글자를 추출함 ->char타입이므로 '' 으로

            case 'y' :
                System.out.println("종료합니다!");
                break;
            case 'n' :
                System.out.println("취소합니다!");
                break;
        }
    }
}
