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

class DocumentTest {   // 유틸리티처럼 되었다는 경고
    public static void main(String[] args) {
        Document d1 = new Document(); // 문서 제목없음1 가 생성되었습니다.
        Document d2 = new Document("자바.txt"); // 문서 자바.txt 가 생성되었습니다.
        Document d3 = new Document(); // 문서 제목없음2 가 생성되었습니다.
        Document d4 = new Document(); // 문서 제목없음3 가 생성되었습니다.
        Document d5 = new Document(); // 문서 제목없음4 가 생성되었습니다.

    }
}
