package day24.board;

import day24.MyConn;
import day24.board.entity.BoardEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Data Access Object - DAO
public class BoardDao {

    public static int insBoard(BoardEntity entity) {
        int result = 0;
        String sql = "insert into board (title, ctnts, writer) values(?, ?, ?)";



        System.out.println(sql);
        try {
            Connection conn = MyConn.getConn();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());


            result = ps.executeUpdate();



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

        }

        return result;
    }

}

