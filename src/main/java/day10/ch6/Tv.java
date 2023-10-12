package day10.ch6;

public class Tv  {
    // 속성 property
    // 멤버 필드 memberField
    String color;
    boolean power;
    int channel;


    // 메소드 method
    // 멤버 메소드
    //
    // 기본구조
    // 리턴타입 메소드명 (파라미터)

    // define
    void power() { // 선언부
        power = !power; // 구현부
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
    // this 는 상수
}
