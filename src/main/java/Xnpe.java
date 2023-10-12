public class Xnpe {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str);
        // npe 안터짐
        // 메소드나 필드를 '사용' 해야 터짐.


        FieldOfXnpe fieldOfXnpe = new FieldOfXnpe();
        System.out.println(fieldOfXnpe.fe);
        // npe 안터짐
        // 메소드나 필드를 '사용' 해야 터짐.


        System.out.println(fieldOfXnpe.getFe());
        // getter 를 통해서 받아와도 안터짐
        // 즉, 리턴도 null able.
    }
}