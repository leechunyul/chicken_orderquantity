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
        List<ChickenDTO> list = chickenDao.getRegionalGroup();
        if (list.isEmpty()) {
            throw new SQLException("검색된 레코드가 없습니다");
        }
        return list;
    }

    @Override
    public List<ChickenDTO> chickAgeGroup() throws SQLException {
        List<ChickenDTO> list = chickenDao.getAgeGroup();
        if (list.isEmpty()) {
            throw new SQLException("검색된 레코드가 없습니다");
        }
        return list;
    }
}
