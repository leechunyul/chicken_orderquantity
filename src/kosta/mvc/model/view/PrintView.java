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
        int sum=0;
        for (ChickenDTO dto : list) {
            sum+=dto.getCall();
            if (cnt <4) {
                System.out.println(cnt+"위 : "+dto.getEupmundong()+" ==> 주문이용량 : "+dto.getCall()+"건");
            }
            cnt++;
        }
        System.out.println("------------------------------------------------>"+(cnt-1)+"개동 " + "전체주문 총 "+sum+"건");

    }
    public static void selectPrintAge(List<ChickenDTO> list) {

        int cnt=1;
        int sum=0;
        for (ChickenDTO dto : list) {
            sum+=dto.getCall();
            if (cnt <4) {
                System.out.println(cnt+"위 : "+dto.getAgeRange()+" ==> 주문이용량 : "+dto.getCall()+"건");
            }
            cnt++;
        }
        System.out.println("------------------------------------------------>"+(cnt-1)+"개 연령대" + "전체주문 총 "+sum+"건");
    }
    public static void selectPrintTime(List<TimeDTO> list) {
        int cnt=1;
        int sum=0;
        for (TimeDTO dto : list) {
            sum+=dto.getCall();
            if (cnt <4) {
                System.out.println(cnt+"위 : "+dto.getTime()+"시 대 ==> 주문이용량 : 총"+dto.getCall()+"건");
            }
            cnt++;
        }
    }
    public static void selectPrintGender(List<TimeDTO> list) {
        int cnt=1;
        for (TimeDTO dto : list) {

            System.out.println(cnt+"위 : "+dto.getGender()+" ==> 주문이용량 : 총"+dto.getCall()+"건");
            cnt++;
        }
    }
}
