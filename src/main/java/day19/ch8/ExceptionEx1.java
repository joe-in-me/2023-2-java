package day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {

        int num = 0;
//        num = num / 0;

        // 예외 발생시 System.exit() 를 막기위해 예외처리를 해줌.
        try {
            num = 10;
            num = num / 0; // 오류 발생
            System.out.println("계속되고 있습니까?");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("catch 에서 잡았습니다.");
        } finally {
            System.out.println("finally 실행!!");
        }




        System.out.println("num = " + num);
        System.out.println("---- 끝 ----");
    }
}

class ExceptionEx1_2 {
    public static void main(String[] args) {
        div(10);
    }

    public static void div(int num) {
        try {
            num = 10;
            return;
            // 리턴을 만났을때, finally 는 실행을 하고 돌아간다!!!
            // 즉, 항상 실행이 보장된다.
        } catch (Exception e) {
            e.printStackTrace();
            num = -1;
        } finally {
            System.out.println("finally 실행!!");
        }

        System.out.println("num = " + num);
        System.out.println("---- 끝 ----");
    }
}

class ExceptionEx1_3 {
    public static void main(String[] args) {

        try {
//            int num = 10 / 0;

//            ExceptionEx1_3 obj = null;
//            obj.sum();

              int[] arr = new int[10];
              arr[10] = 10;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("수학적 예외 또는 ArrayIndexOutOfBounds 예외");
        } catch (NullPointerException e) {
            System.out.println("널 포인트 예외");
        } catch (Exception e) {
            System.out.println("모든 예외");
        }
        System.out.println("---끝---");
    }

    public void sum(){

    }
}
