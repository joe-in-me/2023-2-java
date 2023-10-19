package day16.ch7;

public class Singleton {
    private static Singleton singleTon;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleTon == null) singleTon = new Singleton();
        return singleTon;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
