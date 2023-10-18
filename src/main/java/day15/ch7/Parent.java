package day15.ch7;

public class Parent {
    int age;
}

/*
 * 부모 생성자에 매개변수가 있는 생성자만 있다면,
 * 자식클래스의 생성자에 오류가 발생한다.
 * -> super() 가 기본으로 호출되므로.
 *
 * 따라서 부모 생성자에 기본 생성자까지도 추가해주거나,
 * 자식클래스의 생성자마다 super() 를 해서, 부모 클래스의 파라미터가 있는 하나뿐인 생성자를 직접 호출해주어야한다.
 *
 * */

/*
 * 내부 구동 개념 :
 * 메모리에 부모클래스 객체 생성 -> 자식클래스 생성 -> 자식클래스에서 부모 클래스 객체를 참조 (정확히는 참조하는 super 를 생성!)
 * 그래서 super 와 this 를 사용할 수 있는것!
 *
 * */


class Child extends Parent {

    void play() {
        System.out.println("놀자");
    }
}


class Child2 extends Parent {
    void jump() {
        System.out.printf("%d 살의 아이가 점프를 하였다.\n", age);

    }
}


class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.age = 10;
        child.play();

        Child2 child2 = new Child2();
        child2.age = 7;
        child2.jump();
        /*
         * 모든 생성자의 구조 :
         * 접근제한자 클래스명(필요파라미터) {
         *   super();
         * }
         *
         * super(); 가 생략되어 있음.
         *
         * */
    }
}
