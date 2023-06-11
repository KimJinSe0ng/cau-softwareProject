package ch10.sec01;

import java.io.*;
import java.sql.*;

public class ConnectionExample {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521/xe",
                    "java",
                    "oracle"
            );
            System.out.println("Connection success");

            String sql = """
                    SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata
                    FROM boards
                    WHERE bwriter=?
            """;

            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, "winter");

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) { // 다음행의 데이터를 가리키게 되는 포인터(맨 처음엔 1번째 행 데이터 가리킴)
                Board board = new Board();
                board.setBno(rs.getInt(1));
                board.setBtitle(rs.getString(2));
                board.setBcontent(rs.getString(3));
                board.setBwriter(rs.getString(4));
                board.setBdate(rs.getDate(5));
                board.setBfilename(rs.getString(6));
                board.setBfiledata(rs.getBlob(7));

                System.out.println(board);

                Blob blob = board.getBfiledata();
                if (blob != null) {
                    InputStream is = blob.getBinaryStream();
                    OutputStream os = new FileOutputStream("/Users/bigbird/study/softwareproject/src/ch10/" + board.getBfilename());
                    is.transferTo(os);
                    os.close();
                    is.close();
                }
            }
            rs.close();
            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close(); // DB 연결 끊음
                    System.out.println("Connection disconnected");
                } catch (SQLException e) {
                }
            }
        }
    }
}
