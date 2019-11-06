package kosta.mvc.model.dao;

import java.sql.SQLException;
import java.util.List;

import kosta.mvc.model.dto.ChickenDTO;
import kosta.mvc.model.dto.TimeDTO;

public interface ChickenDao {

    /**
     * 1. 지역별
     */
    List<ChickenDTO> getRegionalGroup() throws SQLException;
    /**
     * 2. 연령대별
     */
    List<ChickenDTO> getAgeGroup() throws SQLException;

    /**
     * 3. 성별
     */
    List<TimeDTO> getGenderGroup() throws SQLException;
    /**
     * 4. 시간대
     */
    List<TimeDTO> getTimeGroup() throws SQLException;
}
