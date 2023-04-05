package day08.poly.Car;

public class CarShop {

    Car[] cars;
    //    Mustang[] mustangs;
    //    Stinger[] stingers;
    //    Tucson[] tucsons;

    // 대리점에 차를 입고하는 기능
    public void importCar() {
//        Mustang m = new Mustang();
//        Stinger s = new Stinger();
//        Tucson t = new Tucson();
        Car m = new Mustang();
        Car s = new Stinger();
        Car t = new Tucson();

        cars  = new Car[]{
                new Mustang(),
                new Stinger(),
                new Tucson()
        };
        // 문자열과 정수와 논리를 배열에 담을 수 있나?
        // object는 최상위객체이므로 담을 수는 있다!
        // 하지만 안전하지 않기 때문에 사용을 지양함.
        Object[] oArr = {
                50, 30, 3.3, "zzzz", false,
                new Mustang()
        };
    }

    // 주행 테스트 기능
    public void runTest() {
        importCar(); // 차입고
        for (Car car : cars) {
            car.accelerate();
        }
    }

    // 차를 고객에게 인도하는 기능
    public Car exportCar(int money) {
        if(money == 6000){
            return new Mustang();
        } else if (money == 5000) {
            return new Stinger();
        } else if (money ==3000) {
            return new Tucson();
        } else {
            return null;
        }
    }
}
