package day09.final_;

public class Main {
    public static void main(String[] args) {
        Person kim = new Person(
                "김철수",
                "000111-2123123",
                Person.nation,
                new BagPack(5, "샘소나이트"));

        kim.name = "김출수";
        kim.bagPack = new BagPack(10, "기본");

        new Person("박영희",
                "002344-2352355",
                Person.nation, null);

    }
}
