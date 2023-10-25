package day19.teststarcraft;

public interface Movable {

    void move(int axisX, int axisY);

}

class Unit implements Movable {
    private String unitName;
    private int axisX;
    private int axisY;


    protected Unit() {
        setAxes(0, 0);
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setAxes(int axisX, int axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }


    private void move() {
        System.out.printf("%s 이(가) X: %d, Y: %d 로 이동합니다.", this.unitName, this.axisX, this.axisY);
    }

    @Override
    public void move(int axisX, int axisY) {
        this.setAxes(axisX, axisY);
        this.move();

    }

}

class Marin extends Unit {

    public Marin() {
        init();
    }

    private void init() {
        super.setUnitName(this.getClass().getSimpleName());
    }

}

class UnitTest {
    public static void main(String[] args) {
        Unit unit = new Marin();
        unit.move(10, 20);
    }
}