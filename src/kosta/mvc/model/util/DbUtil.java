package kosta.mvc.model.util;

import java.sql.*;

public class DbUtil {

    /**
     * 로드
     */
    static {
        try {
            Class.forName(DbProperty.DRIVER_NAME);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    /**
     * 연결
     */
    public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection(
                DbProperty.URL,
                DbProperty.USER,
                DbProperty.PASSWORD
        );
    }
    /**
     * 닫기(db관련 사용된 객체를 close()한다)
     * (insert, update, delete 인 경우)
     */
    public static void dbClose(Connection con, Statement st){
        try {
            if(st!=null)st.close();
            if(con!=null)con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * 닫기(db관련 사용된 객체를 close()한다)
     * (select 인 경우)
     */
    public static void dbClose(Connection con, Statement st, ResultSet rs){
        try {
            if(rs!=null)rs.close();
            dbClose(con,st);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }



}
