package day07.static_;

import java.util.Scanner;

public class Utility {

    private static Scanner sc = new Scanner(System.in);

    private Utility(){}  // 객체 생성 못하게 차단

    // 구분선을 출력하는 기능
    public static void makeLine() {
        System.out.println("=============================");
    }

    // 문자열을 입력받는 기능
    public static String input(String message) {
        System.out.print(message);
        return  sc.nextLine();
    }
}
