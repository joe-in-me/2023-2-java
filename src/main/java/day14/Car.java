package day14;

public class Car {
    String color;
    String gearType; // 변속기 종류 - auto(자동), manual(수동)
    int door; // 문

    public Car() {
//        this.color = "white";
//        this.gearType = "auto";
//        this.door = 4;

        this("white");

    }

    public Car(String color) {
//        this();
//        this.color = color;
        this(color, "auto", 5);
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    public void printMySelf() {
        System.out.printf("color=%s, gearType=%s, door=%d\n", this.color, this.gearType, this.door);
    }

}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("black");
        car1.printMySelf();

        car1.printMySelf(); // color=while, gearType=auto, door=4
        car2.printMySelf(); // color=blue, gearType=auto, door=4




    }


}

