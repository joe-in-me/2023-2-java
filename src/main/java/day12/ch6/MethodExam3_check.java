package day12.ch6;

public class MethodExam3_check {

    int sumTest(String str) {
        return 10;
    }


    public static void main(String[] args) {
        // static 이지만, static 이 아닌 메소드를 사용할 때,
        // 객체를생성해서 사용하면 문제가 없음.
        // ㄴ> 외부 클래스에 있는 static main인 경우를 생각해 보라!
        MethodExam3_check methodExam3 = new MethodExam3_check();
        int i = methodExam3.sumTest(" ");
        System.out.println("i = " + i);
    }


}
