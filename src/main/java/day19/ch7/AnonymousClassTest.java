package day19.ch7;

public class AnonymousClassTest {

    public static void main(String[] args) {
        Runnable2 run = new RunRobot();
        Runnable2 run2 = new Runnable2() {
            @Override
            public void run() {
                System.out.println("익명");
            }
        };


    }
}



class RunRobot implements Runnable2 {
    @Override
    public void run() {
        System.out.println("로봇이 달린다.");
    }
}

interface Runnable2 {
    void run();
}

