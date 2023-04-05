package day03;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
//    영역  값
        a = b;

        String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
        foods[0] = foods[1];   // = 은 값복사
        foods[2] = "치킨";

        System.out.println(Arrays.toString(foods));

        // 인덱스 탐색 알고리즘
//        1) 이진탐색 : 반 쪼개서 a영역 검사, b영역 검사
//        2) 선형탐색 : 순차적으로 탐색(앞/뒤 모두 가능)
        int index = -1;
        String target = "햄버거";   // 타겟이 없다면 -1.
        for (int i = 0; i < foods.length; i++) {
            if (target.equals(foods[i])) {
                index = i;
                break;
            }
        }
        System.out.println("찾은 인덱스:" + index);
    }
//    // indexOf 사용
//    String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
//    public static int indexOf(String target) {
//        int index =-1;
//        for (int i = 0; i < foods.length; i++) {
//            if (target.equals(foods[i])) {
//                index = i;
//                break;
//                return i;
//            }
//        }
//        return -1;
//    }
}


