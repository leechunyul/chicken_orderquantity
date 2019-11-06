package kosta.mvc.model.service;

import kosta.mvc.model.dao.ChickenDao;
import kosta.mvc.model.dao.ChickenDaoImpl;
import kosta.mvc.model.dto.ChickenDTO;

import java.sql.SQLException;
import java.util.List;

public class ChickServiceImpl implements ChickService{
    private ChickenDao chickenDao = new ChickenDaoImpl();

    @Override
    public List<ChickenDTO> chickRegionalGroup() throws SQLException {
        List<ChickenDTO> list =

        return null;
    }

    @Override
    public List<ChickenDTO> chickAgeGroup() throws SQLException {
        return null;
    }
}
