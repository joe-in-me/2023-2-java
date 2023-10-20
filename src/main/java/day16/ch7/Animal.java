package day16.ch7;

/*
 * Animal
 * */
public class Animal {
    public void crying() {
        System.out.println("동물이 운다.");
    }
}

/*
 * Dog
 * */
class Dog extends Animal {
    @Override
    public void crying() {
        System.out.println("멍! 멍!");
    }
}

/*
 * Bulldog
 * */
class Bulldog extends Dog {
    public void jump() {
        System.out.println("볼독이 점프! 점프!");
    }

    @Override
    public void crying() {
        System.out.println("불독이 왈! 왈!");
    }
}

/*
 * Cat
 * */
class Cat extends Animal {
    @Override
    public void crying() {
        System.out.println("야옹~ 야옹~");
    }
}

/*
 * .main
 * */
class AnimalTest {
    public static void main(String[] args) {
        Dog dog1 = new Bulldog();
        Animal animal1 = new Bulldog();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();
        //
//        Bulldog bulldog1 = new Dog();

        Bulldog bulldog1 = new Bulldog();
        bulldog1.jump();
        bulldog1.crying();
        //
        Dog dog = new Bulldog();
        dog.crying();

        System.out.println("---------------");


    }
}

class AnimalTest2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();

        callCrying(dog);
        callCrying(cat);
        callCrying(bulldog);

        System.out.println("----------");


    }


    private static void callCrying(Animal animal) {

        if (animal instanceof Bulldog) ((Bulldog) animal).jump();
        animal.crying();

    }

    private static void callCrying(Animal animal, boolean v2) {
        if (animal.getClass().equals(Bulldog.class)) ((Bulldog) animal).jump();
        animal.crying();
    }
}

class AnimalTest3 {
    public static void main(String[] args) {
        Animal animal = new Cat();
        System.out.println(animal instanceof Dog);
//        Dog dog = (Dog) animal;

        System.out.println(animal instanceof Cat);
        Cat cat = (Cat) animal;

        System.out.println("------------");


    }
}

/*
 *
 * 상속관계에서 다른 타입의 객체를 담을 수 있는것.
 * 특징으로는
 * 1. 부모타입은 자식 타입 담기 o
 * 2. 자식타입은 부모 타입 담기 x
 * 3. 기능은 타입, 실행은 객체자체 의 멤버를 사용할 수있고,실행할 수 있음.
 *
 * */
