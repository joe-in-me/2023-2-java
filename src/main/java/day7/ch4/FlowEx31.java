package day7.ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        // 0부터 10까지 11번 반복해서 출력
        // 3의 배수는 (0 포함) 출력이 안되도록

        for (int i = 0; i < 11; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}



