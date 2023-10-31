package day24;

import day24.board.BoardDao;
import day24.board.entity.BoardEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnTest {
    static Connection conn;

    public static void main(String[] args) {
        // MyConn 에 있는 getConn 메소드 호출, 메소드가 리턴해주는 값 저장하기
        conn = MyConn.getConn();

        String sql = "insert into country (country_id, country) values(111, '동하나라')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result = " + result);



        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
class MyConnTest2{
    public static void main(String[] args) {
        // title: 처음 작성
        // ctnts: 처음 작성하는 내용 입니다.
        // writer: 홍길동
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setTitle("오늘 INSERT 배움");
        boardEntity.setCtnts("자바를 통해 board 테이블이 값 넣어봄.");
        boardEntity.setWriter("신난다");

        int row = BoardDao.insBoard(boardEntity);
        System.out.println("row = " + row);

    }
}