package day04;
// 댄서의 설계도(객체)
// 설계도에는 main(실행에 대한 영역!)을 만들지 않음.
public class Dancer {

//   *  속성(메인의 내부 아닌 클래스의 내부에 작성) : 필드! 변수아님. 사용되도 사라지지 않음.
    String dancerName;   // 설계도이기 때문에 아직 값을 결정하지 않음.
    String crewName;
    String genre;
    DanceLevel level;   // 댄스수준 (0:초보자, 1:중수, 2:고수)

//    * 생성자 : 스카우터, 개발자, 기술자
    // 생성자도 함수개념, 리턴이 주소값 타입으로 고정
    // 리턴값은 생성한 객체의 주소값을 리턴
    // 객체 생성시 필요한 데이터를 세팅
    Dancer() {
        dancerName = "갑돌이";
        crewName = "갑패밀리";
        genre = "민속놀이";
        level = DanceLevel.AMATUER;
    }

    // 생성자 오버로딩
    Dancer(String dgenre) {
        dancerName = "철수";
        crewName = "철수와 영희";
        genre = dgenre;
        level = DanceLevel.BEGINNER;
    }

    Dancer(String dName, String dGenre, DanceLevel dLevel) { // d@들은 매개변수! 사용되면 사라짐.
        dancerName = dName;
        crewName = "하하호호";
        genre = dGenre;
        level = dLevel;
    }



//   *  기능(메서드) : 아직 static을 붙이지 마시오.
    // 춤추는 기능
    void dance() {
        System.out.println(genre + "춤을 열정적으로 춥니다.");
    }

    // 스트레칭 하는 기능
    void stretch() {
        System.out.println("몸을 유연하게 풉니다.");
    }

    // 자기소개 하는 기능
    String introduce(){
        return String.format("내 이름은 %s이고, %s팀에 소속되어 있습니다.", dancerName, crewName);
    }  // String.format : 리턴값에서는 fintf 사용안되므로 이를 대체함.

}
