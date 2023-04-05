package day07.protec.pac2;

import day07.protec.pac1.A;

public class D extends A {

    D(){               // protected 는 상속 적용o, default 는 상속에서 적용x
        super(10);

        f1 = 1;
//        f2 = 2;

        m1();
//        m2();
    }
}
