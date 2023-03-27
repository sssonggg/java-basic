package day02;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {

    // int n1 = [10, 20, 30]; == 이런 형태 안됨

        // 배열의 생성(= 객체 생성), int[]은 8바이트
        // 동종 모음 구조
        int[] arr = new int[5];
        System.out.println("arr = " + arr);

        arr[0] = 50;
        arr[1] = 70;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 66.7;
        arr[4] = 100;

        // 배열의 길이 - 저장 데이터 개수
        // 자바의 배열 immutable(불변성)
        System.out.printf("배열의 길이 : %d\n", arr.length);

        // 배열 반복문 처리 (단축키 fori)
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번 데이터 : %d\n", i+1, arr[i]);


        // foreach문 (단축키 iter) -> for문, while문 등 : alt+enter
        for(int n : arr) {
            System.out.printf("데이터 : %d\n", n);
            }

        // 배열 내부데이터 문자열로 출력
            System.out.printf(Arrays.toString(arr));

        }
    }
}
