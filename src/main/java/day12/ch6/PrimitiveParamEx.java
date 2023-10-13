package day12.ch6;

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data data = new Data();
        data.x = 10;
        System.out.printf("main() : x = %d\n", data.x);
    }

    public static void change(int x) {
    }
}

class Data {
    int x;
}