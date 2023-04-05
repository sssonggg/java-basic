package day04;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String myName = "홍길동";
        String inputName = sc.nextLine();

        System.out.println("inputName = " + inputName);
        System.out.println("myName = " + myName);

        if(myName.equals(inputName)) { // 기본타입 외에는 다 equals로 비교하기!
            System.out.println("두 이름이 일치함!");
        }else {
            System.out.println("두 이름이 일치하지 않음!");
        }
    }

}
