package day03;

import java.util.Arrays;
// 배열 값 삭제하기
public class ArrayDelete {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("삭제 전 :" + Arrays.toString(arr));

//       정규화시키기(반복문)
        int delIndex = 1;
        for(int i = delIndex; i<arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }

        /*
        arr[1] = arr[2];
        arr[2] = arr[3];
        arr[3] = arr[4];
        arr[4] = arr[5];
        */

//      마지막 값 삭제하기(pop)
        int[] temp = new int[arr.length - 1];
        for(int i = 0; i < temp.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;

//        삭제 후 결과
        System.out.println("삭제 후 :" + Arrays.toString(arr));


    }
}
