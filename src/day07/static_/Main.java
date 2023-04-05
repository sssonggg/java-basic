package day07.static_;

// static 필드와 메서드를 그냥 참조가능
import static day07.static_.Count.*;
import static day07.static_.Utility.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(x);
        System.out.println(random());

        m1(new Count());

        Count c1 = new Count();
        Count c2 = new Count();

        c2.m2();

        x = 10;
        c2.y = 20;

        x++;


        System.out.printf("c1 = x: %d, y: %d\n", c1.x, c1.y);
        System.out.printf("c2 = x: %d, y: %d\n", c2.x, c2.y);

        Calculator cal1 = new Calculator();   // kim
        Calculator cal2 = new Calculator();   // park

        cal1.color = "빨강";
        cal2.color = "초록";
        System.out.println("cal1 = " + cal1.color);

        Calculator sharp = new Calculator();
        Calculator.calcAreaCircle(5);

        sharp.paint("노랑");

        makeLine();



    }
}
