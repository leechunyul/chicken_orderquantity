package kosta.mvc.model.service;

import kosta.mvc.model.dto.ChickenDTO;

import java.sql.SQLException;
import java.util.List;

public interface ChickService {

    /**
     * 1. 지역별
     */
    List<ChickenDTO> chickRegionalGroup() throws SQLException;
    /**
     * 2. 연령대별
     */
    List<ChickenDTO> chickAgeGroup() throws SQLException;

}
