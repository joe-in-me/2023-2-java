package day19.ch7.starcraft;


import java.util.ArrayList;
import java.util.List;

class StarcraftGame {
    public static void main(String[] args) {
        Unit unit = new Marine();
        unit.move(10, 20);

        Unit unit2 = new Tank();
        unit2.move(10, 20);

        List<Unit> units = new ArrayList<>();
        units.add(unit);
        units.add(unit2);
        units.add(new Marine());
    }
}

class StartcraftGame2 {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Marine());

        units.add(new Tank());
        units.add(new Tank());

        moveAll(units, 30, 50);
        Unit unit = units.get(units.size() - 1);
//        Tank tank = (Tank) unit;
        ((Tank) unit).changeMode();
        ((Tank)units.get(units.size() - 1)).changeMode();


    }

    public static void moveAll(List<Unit> units, int x, int y) {
        for (Unit unit : units) {
            unit.move(x, y);
        }

//        System.out.println("-----------");
//
//        for (int i = 0; i < units.size(); i++) {
//            units.get(i).move(x, y);
//        }
    }
}

public abstract class Unit {
    private int x;
    private int y;


    public abstract void move(int x, int y);

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void stop() {
        System.out.println("현재 위치에 정지");
    }
}

class Marine extends Unit {
    @Override
    public void move(int x, int y) {
        super.setX(x);
        super.setY(y);
        System.out.printf("마린이 좌표 x: %d, y: %d 로 이동\n",
                super.getX(), super.getY());
    }

    public void steamPack() {
        System.out.println("스팀팩 시전!!!");
    }
}

class Tank extends Unit {
    private boolean siegeMode;

    @Override
    public void move(int x, int y) {
        super.setX(x);
        super.setY(y);
        System.out.printf("탱크가 좌표 x: %d, y: %d 로 이동\n",
                super.getX(), super.getY());
    }

    // siegeMode = false 는 시즈모드가 아님.
    // 이상태에서 changeMode() 메소드 호출시 시즈모드가 되어야 함.
    // siegeMode = true; 로 만들고, 콘솔에 "시즈모드가 되었습니다." 출력

    // siegeMode = true 는 시즈모드가 된 상태.
    // 이상태에서 changeMode 메소드 호출시 > 시즈모드가 풀려야 함.
    // siegeMode = false; 로 만들고, 콘솔에 "시즈모드가 풀렸습니다." 출력
    public void changeMode() {
        this.siegeMode = !siegeMode;
        System.out.println(siegeMode ?
                "시즈모드가 되었습니다." :
                "시즈모드가 풀렸습니다.");
    }
}
