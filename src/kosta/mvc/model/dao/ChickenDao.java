package kosta.mvc.model.dao;

import kosta.mvc.model.dto.ChickenDTO;

import java.sql.SQLException;
import java.util.List;

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

    /**
     * 4. 시간대별
     */
}
