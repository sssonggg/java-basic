package day05.player;

public class Main {
    public static void main(String[] args) {
        Player parking = new Player("주차왕파킹");
        Player gondue = new Player("딸기곤듀");
        System.out.println("===============================");
        Player naname = new Player();


        //주체         타겟  ---->>> 선언된 같은 타입이어야 함.
        gondue.attack(parking);
        System.out.println("parking의 주소:" +parking);
        System.out.println("gondue의 주소:" +parking);


        System.out.println("주차왕 남은체력: " + parking.hp);
    }
}
