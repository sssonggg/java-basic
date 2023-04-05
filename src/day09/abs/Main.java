package day09.abs;

public class Main {
    public static void main(String[] args) {
        Pet[] pets = {
                new Dog("해피", "푸들", 2),
                new Dog("초코", "시츄", 3),
                new Dog("구름", "비숑", 4),
                new Cat("야옹", "러시안블루", 2)
        };

//        new Pet("그냥동물", "그냥종", 1);

        for(Pet pet : pets) {
            pet.takeNap();

        }
    }
}
