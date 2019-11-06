package kosta.mvc.model.util;
//정보를 상수필드로 관리
public interface DbProperty {
    static final String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
    static final String URL="jdbc:oracle:thin:@oracle-11g.cgdp9ris0wuf.ap-northeast-2.rds.amazonaws.com:1521:ORCL";//ip바꿔주면 다른 컴에서도 사용가능
    static final String USER="admin";
    static final String PASSWORD="chickenorder";
}
