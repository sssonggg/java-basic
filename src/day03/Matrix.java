package day03;

import java.util.Arrays;

//2차원 배열 : 배열을 또 배열로 묶는 것
public class Matrix {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

        int [] kimScores = {n1, n2, n3};
        int [] parkScores = {50, 40, 30};
        int [] hongScores = {10, 100, 10};

        // 2차원 배열
        int[][] classScores = {kimScores, parkScores, hongScores};
        System.out.println(classScores[0][0]);    // 같음
        System.out.println(kimScores[0]);         // 같음
        System.out.println(classScores[0][2] = classScores[1][1]);

        System.out.println(Arrays.toString(classScores));  // 주소값
        System.out.println(Arrays.toString(classScores[1]));  // 같음
        System.out.println(Arrays.toString(parkScores));      // 같음

        //deepToString
        System.out.println(Arrays.deepToString(classScores));  // 배열 속 배열 형태

        // 2차원 배열의 값 초기화
        int[][] arr2d = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {100, 200, 300},
        };

        System.out.println("==================");
        System.out.println(arr2d[1][2]);  // 값 찾을 때 : arr2d[2행-1][3열-1]

        int[] arr3 = arr2d[2];

        // 2차원 배열의 순회
        for (int[] arr : arr2d) {
            for(int n : arr) {
                System.out.printf("%3d ", n);  // %3d :출력시 3칸 차지하라는 뜻
            }
            System.out.println();
        }

        // 배열의 기본값
        // 정수 배열은 0이 기본값, 실수는 0.0이 기본값
        // 논리는 '거짓'이 기본값, char는 기본값 공백(null 아님)
        // 문자열 & scanner 등 나머지는 null
        String [] numbers = new String[5];
        System.out.println("====================");
        System.out.println(Arrays.toString(numbers));

        // 5행 4열의 2차원 배열을 생성만 하고 싶다.
        int[][] newArr = new int[5][4];  // => 배열 생성할 때 : 행열의 숫자를 그대로 작성(5행, 4열)

        // 2차원 배열의 수정

        // newArray 2행 4열 값을 수정
        newArr[1][3] = 99;   // => 값 찾을 때(인덱스) : 행,열 -1
        newArr[2][1] = 50;
        newArr[3] = new int[] {9, 8, 7, 6};   // new int[]는 선언과 동시에 초기화할때만 제외 가능

        System.out.println("===================");
        for (int[] ints : newArr) {
            for(int anInt : ints) {
                System.out.printf("%3d ", anInt);
            }
            System.out.println();
        }

        // 3차원 배열
        int[][][] arr3d = {
                {
                        {10, 80},
                        {30, 10},
                },
                {
                        {40, 20},
                        {10, 50},
                },
                {
                        {50, 20},
                        {100, 10},
                },
        };

        System.out.println(arr3d[0][0][1]);     // 결과 : 80


    }
}
