package kosta.mvc.model.view;

import kosta.mvc.model.dto.ChickenDTO;
import kosta.mvc.model.dto.TimeDTO;

import java.sql.ClientInfoStatus;
import java.util.List;

public class PrintView {
    public PrintView() {
    }

    public static void selectPrintRegion(List<ChickenDTO> list) {
        int cnt=1;
        for (ChickenDTO dto : list) {

            System.out.println(cnt+"위 : "+dto.getEupmundong()+" ==> 주문이용량 : 총"+dto.getCall()+"건");
            cnt++;
        }
    }
    public static void selectPrintAge(List<ChickenDTO> list) {
        int cnt=1;
        for (ChickenDTO dto : list) {

            System.out.println(cnt+"위 : "+dto.getAgeRange()+" ==> 주문이용량 : 총"+dto.getCall()+"건");
            cnt++;
        }
    }
    public static void selectPrintTime(List<TimeDTO> list) {
        int cnt=1;
        for (TimeDTO dto : list) {

            System.out.println(cnt+"위 : "+dto.getTime()+" ==> 주문이용량 : 총"+dto.getCall()+"건");
            cnt++;
        }
    }
    public static void selectPrintSex(List<TimeDTO> list) {
        int cnt=1;
        for (TimeDTO dto : list) {

            System.out.println(cnt+"위 : "+dto.getGender()+" ==> 주문이용량 : 총"+dto.getCall()+"건");
            cnt++;
        }
    }
}
