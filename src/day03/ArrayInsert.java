package day03;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // 20이랑 30사이에 넣고 싶음.
        int targetIndex = 2;
        int newData = 25;   // 2번 인덱스에 넣어야 함

        // 1. 배열의 사이즈 먼저 1늘리기
        // 2. 원본배열을 다 복사하기
        // 3. 맨 뒤부터 타겟 인덱스까지 한칸씩 뒤로 밀기
        // 4. 타겟 인덱스 자리에 새 데이터를 넣는다.
        // 5. 주소를 바꾼다.

        int [] newArr = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println("새로운 배열 : " + Arrays.toString(newArr));

//        newArr[newArr.length] = newArr[newArr.length-1]
//        newArr[5] = newArr[4];
//        newArr[4] = newArr[3];
//        newArr[3] = newArr[2];

         // 정규화(반복문)
        for (int i = newArr.length-1; i > targetIndex; i--) {
            newArr[i] = newArr[i-1];
        }
        // 타겟 인덱스 자리에 새 데이터 넣기
        newArr[targetIndex] = newData;

        // 주소 바꾸기
        arr = newArr;
        newArr = null;

        System.out.println("삽입된 배열 : " + Arrays.toString(arr));
    }
}
