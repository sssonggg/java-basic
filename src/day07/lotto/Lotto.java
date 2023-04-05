package day07.lotto;

// 1~45까지의 6개 값을 가진 배열을 만든다.
// 배열의 값은 랜덤한 숫자로 이루어져있다.
// 배열의 값은 중복되지 않는다.

import java.util.Arrays;

public class Lotto {

    static void information() {

        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;


                }
            }
            System.out.print(lotto[i] + " ");
        }

    }

//    protected static int[] getLotto() {
//        makeLotto();
//        return lotto;
//    }


}
//        System.out.println(Arrays.toString(lotto));


