package day08.poly;

class A{}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic { // 상속을 받은 자식객체는 부모타입을 받아올 수 있음
    A x1 = new A();
    B x2 = new B();
    C x3 = new C();
    D x4 = new D();
    E x5 = new E();

    void test() {
        int a = 10;
        double b = a;

        B x = new B();
        A z = x;
//        C y = (C) z;

    }

}


