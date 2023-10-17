package day14.ch6;

public class Document {
    static int count;
//    String text;

    public Document() {
        this("제목없음" + ++count);
    }

    public  Document(String txt) {
//        this.text = txt;
        System.out.printf("문서 %s 가 생성되었습니다.\n", txt);
    }

}

class DocumentTest {
    /*
    * 유틸리티처럼 되었다는 경고 || 유틸리티클래스 -> 인스턴스 없이 전체가 static 으로 구성된 클래스.
    * (Math.random 처럼 곧바로 쓸 수있는 유틸리티들만 모은것.)
    *
    * 은닉화 없이 유틸리티로 바로 접근할 수 있게 캡슐화만 해놓은 클래스.
    * 메소드는 static 이 아닌게 존재하고, 필드에는 static 만 있으니 IDEA 에서 경고를 띄우는것.
    * 무시해도 된다고 함.
    *
    * 경고를 제거하고 싶으면 위의 주석 2개를 모두 주석제거 하면 해결은 됨.
    * */
    public static void main(String[] args) {
        Document d1 = new Document(); // 문서 제목없음1 가 생성되었습니다.
        Document d2 = new Document("자바.txt"); // 문서 자바.txt 가 생성되었습니다.
        Document d3 = new Document(); // 문서 제목없음2 가 생성되었습니다.
        Document d4 = new Document(); // 문서 제목없음3 가 생성되었습니다.
        Document d5 = new Document(); // 문서 제목없음4 가 생성되었습니다.

    }
}
