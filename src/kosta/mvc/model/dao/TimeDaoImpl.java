package kosta.mvc.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kosta.mvc.model.dto.TimeDTO;
import kosta.mvc.model.util.DbUtil;

public class TimeDaoImpl implements TimeDao {

	public List<TimeDTO> getTimeGroup() throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		List<TimeDTO> list = null;
		ResultSet rs = null;
		String sql = "SELECT *\r\n" + 
				"FROM(SELECT 시간대,시도, SUM(통화건수) AS 통화총량\r\n" + 
				"FROM TIMECHICKEN WHERE 업종='치킨'\r\n" + 
				"GROUP BY 시간대,시도 ORDER BY 통화총량 DESC) \r\n" + 
				"WHERE ROWNUM <=3";
		
		try {
			con = DbUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				
				TimeDTO timeDTO = new TimeDTO(rs.getInt(1),rs.getString(2),rs.getInt(3));
				list.add(timeDTO);
			}
			
		}finally {
			DbUtil.dbClose(con, ps,rs);
		}
	
	return list;
}
	

	
}
