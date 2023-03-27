package day02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        // 배열 복사 알고리즘
        String[] pets = new String[] {"멍멍이", "야옹이", "짹짹이"};
        /*pets[0] = "멍멍이";
        pets[1] = "야옹이";
        pets[2] = "짹짹이";*/

        // 선언과 동시에 초기화할 때만!! new Type[] 생략가능
        String[] pets1 = {"멍멍이", "야옹이", "짹짹이"};

        for(String p : new String[] {"멍멍이", "야옹이", "짹짹이"}) {
        }
        String[] pets2 = {"멍멍이", "야옹이", "짹짹이"};

     // String[] petsCopy = pets2; =  배열의 주소만 복사해온 것과 다름 없음
//        System.out.println("원본주소 : "+ pets2);
//        System.out.println("원본주소 : "+ petsCopy);

        // 1. 원본과 동일한 사이즈의 배열을 하나 더 생성
        String[] petsCopy = new String[pets2.length];

        // 2. 원본의 각 인덱스 값들을 사본에 인덱스로 일일히 복사
//        petsCopy[0] = pets2[0];
//        petsCopy[1] = pets2[1];
//        petsCopy[2] = pets2[2];

        for (int i = 0; i < pets2.length; i++) {
            petsCopy[i] = pets2[i];
        }


        pets2[1] = "사마귀";
        System.out.println("원본배열 :" + Arrays.toString((pets2)));
        System.out.println("원본배열 :" + Arrays.toString((petsCopy)));


    }
}
