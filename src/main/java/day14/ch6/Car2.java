package day14.ch6;

public class Car2 {
    String color;
    String gearType;
    int door;

    public Car2() {
    }

    public Car2(Car2 car) {
//        this.color = car.color;
//        this.gearType = car.gearType;
//        this.door = car.door;
        this(car.color, car.gearType, car.door);
    }


    public Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public void printMySelf() {
        System.out.printf("color=%s, gearType=%s, door=%d\n", this.color, this.gearType, this.door);
    }
}


class Car2Test {
    public static void main(String[] args) {
        Car2 car1 = new Car2();

        car1.color = "black";
        car1.gearType = "manual";
        car1.door = 5;

        Car2 car2 = new Car2(car1);
        car1.printMySelf(); // 둘다 color=black, gearType=manual, door=5
        car2.printMySelf();

    }
}

