package day19.ch7.starcraft2;


/**
 * Movable
 */
interface Movable {
    void move(int x, int y);
}

/**
 * Attackable
 */
interface Attackable {
    void attack(Unit u);
}

/**
 * Fighterble
 */
public interface Fighterble extends Movable, Attackable {
}

/**
 * Unit
 */
class Unit {
    private int currentHp;
    private int x;
    private int y;

}

/**
 * Fighter
 */
class Fighter extends Unit implements Fighterble {

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void attack(Unit u) {

    }
}

/**
 * FighterTest
 */
class FighterTest{
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10, 20);

        // attack 메소드 호출하고싶다면?
        Fighter fighter = (Fighter) movable;
        fighter.attack(null);
        ((Attackable) movable).attack(null);




    }
}