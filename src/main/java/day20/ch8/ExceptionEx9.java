package day20.ch8;

public class ExceptionEx9 {
    public static void main(String[] args) {

        try {
            throw new Exception("고의적 예외발생");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        System.out.println("-- 끝 --");
    }
}
