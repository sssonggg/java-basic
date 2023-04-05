package day04;
// 실행용 클래스
// 이곳에는 설계를 하지 않고, main 메서드를 작성
public class DancerMain {
    public static void main(String[] args) {
       Dancer kim = new Dancer();
       Dancer park = new Dancer("스트릿댄스");
       Dancer jang = new Dancer("장동견", "목각댄수", DanceLevel.PRO);

       Singer song = new Singer("아무개");

       System.out.println(kim);  // 주소값 출력
       System.out.println(kim.introduce());
       System.out.println(park);  // 주소값 출력. kim과 다름
       System.out.println(park.introduce());
       System.out.println(jang);  // 주소값 출력. kim과 다름
       System.out.println(jang.introduce());

       kim.dance();
       park.dance();
       jang.dance();



    }

}
