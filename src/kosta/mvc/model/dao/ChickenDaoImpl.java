package kosta.mvc.model.dao;

import kosta.mvc.model.dto.ChickenDTO;
import kosta.mvc.model.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ChickenDaoImpl implements ChickenDao{
    @Override
    public List<ChickenDTO> getRegionalGroup() throws SQLException {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql = "SELECT *\n" +
                "FROM(SELECT 읍면동,SUM(통화건수) AS 통화총량 FROM CHICKEN GROUP BY 읍면동 ORDER BY 통화총량 DESC)\n" +
                "WHERE ROWNUM <=3";
        List<ChickenDTO> list = new ArrayList<>();
        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ChickenDTO dto = new ChickenDTO(rs.getString(1), rs.getInt(2));
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbUtil.dbClose(con,ps,rs);
        }
        return list;
    }

    @Override
    public List<ChickenDTO> getAgeGroup() throws SQLException {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql = "SELECT *\n" +
                "FROM(SELECT 연령대,시도,SUM(통화건수) AS 통화총량 FROM CHICKEN GROUP BY 연령대,시도 ORDER BY 통화총량 DESC)\n" +
                "WHERE ROWNUM <=3";
        List<ChickenDTO> list = new ArrayList<>();
        try {
            con = DbUtil.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                ChickenDTO dto = new ChickenDTO(rs.getString(1),rs.getString(2), rs.getInt(3));
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DbUtil.dbClose(con,ps,rs);
        }
        return list;
    }
}
