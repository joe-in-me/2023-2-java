package day13.ch6;

public class VarArgEx {

    public static void sum(int... n1) {
        int sum = 0;
        for (int i : n1) {
            sum += i;
        }
        System.out.println("sum: " + sum);
    }

    public static void main(String[] args) {
        VarArgEx.sum(10, 20);
        VarArgEx.sum(10, 20, 30);
        VarArgEx.sum(10, 20, 30, 40);
        VarArgEx.sum(10, 20, 30, 40, 50, 60, 60, 60, 60);
    }
}
