package kosta.mvc.model.controller;

import kosta.mvc.model.dto.ChickenDTO;
import kosta.mvc.model.dto.TimeDTO;
import kosta.mvc.model.service.ChickService;
import kosta.mvc.model.service.ChickServiceImpl;
import kosta.mvc.model.view.PrintView;

import java.sql.SQLException;
import java.util.List;

public class ChickController {
    private static ChickService chickService = new ChickServiceImpl();
    public ChickController() {
    }
    public static void RegionalGroupSelect() {
        try {
            List<ChickenDTO> dto = chickService.chickRegionalGroup();
            PrintView.selectPrintRegion(dto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void AgeGroupSelect() {
        try {
            List<ChickenDTO> dto = chickService.chickAgeGroup();
            PrintView.selectPrintAge(dto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void TimeGroupSelect() {
        try {
            List<TimeDTO> dto = chickService.chickTimeGroup();
            PrintView.selectPrintTime(dto);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
public static void GenderGroupSelect() {
    try {
        List<TimeDTO> dto = chickService.chickGenderGroup();
        PrintView.selectPrintGender(dto);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
