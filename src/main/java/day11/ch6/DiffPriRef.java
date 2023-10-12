package day11.ch6;

public class DiffPriRef {

    public static void main(String[] args) {
        // Primitive 타입과 reference 타입

        int num = 30;
        changeValue(num); // 기본타입
        System.out.println("num = " + num);

        NumBox numBox = new NumBox();
        numBox.value = 30;
        changeValue(numBox); // 참조타입
        System.out.println("numBox.value = " + numBox.value);

        // 참조타입이기 때문에 메소드에서 값이 변경됨.
        // 주소를 주고받기 때문. -> point !
        //                          ㄴ> Primitive type = 값을 주고받는다 // Reference type = 주소값을 주고받는다.
        // 주소를 복사해서 실행시킨다 == 같은 객체를 실행시킨다.

        // Memory 의 Heap 영역에 생성되는 Reference type 의 특성!

    }

    public static void changeValue(int value) {
        System.out.println("DiffPriRef.changeValue - param = int");
        value = 10;

    }

    public static void changeValue(NumBox nb) {
        System.out.println("DiffPriRef.changeValue - param = NumBox");
        nb.value = 10;
    }

}


class NumBox {
    int value;
}
