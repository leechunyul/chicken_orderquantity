package kosta.mvc.model.service;

import java.sql.SQLException;
import java.util.List;

import kosta.mvc.model.dto.ChickenDTO;
import kosta.mvc.model.dto.TimeDTO;

public interface ChickService {

    /**
     * 1. 지역별
     */
    List<ChickenDTO> chickRegionalGroup() throws SQLException;
    /**
     * 2. 연령대별
     */
    List<ChickenDTO> chickAgeGroup() throws SQLException;
    /**
     * 3.성별
     */
    List<TimeDTO>  chickGenderGroup() throws SQLException;
    /**
     * 4.시간대
     */
    List<TimeDTO> chickTimeGroup() throws SQLException;
}
