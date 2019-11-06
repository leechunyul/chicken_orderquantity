package kosta.mvc.model.controller;

import kosta.mvc.model.dto.ChickenDTO;
import kosta.mvc.model.service.ChickService;
import kosta.mvc.model.service.ChickServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class ChickController {
    private ChickService chickService = new ChickServiceImpl();
    public ChickController() {
    }
    public void RegionalGroupSelect() {
        try {
            List<ChickenDTO> dto = chickService.chickRegionalGroup();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
