package kosta.mvc.model.view;

import kosta.mvc.model.controller.ChickController;

import java.util.Scanner;

public class MenuView {
    static Scanner sc = new Scanner(System.in);
    ChickController chickController = new ChickController();
    public static void menuChoice() {
        while(true) {
            System.out.println("\n----------------------------------------");
            System.out.print("[ 1. 지역별 검색 ");
            System.out.print("2. 연령대별 검색 ");
            System.out.print("3. 시간대별 검색 ");
            System.out.print("4. 성별 검색 ");
            System.out.print("5. 종료 ]");

            System.out.println("\n--------------------------------------------");
            System.out.println("선택메뉴는?");
            try {
                int menu = Integer.parseInt(sc.nextLine());//
                switch (menu) {
                    case 1:
                        ChickController.RegionalGroupSelect();
                        break;
                    case 2:
                        ChickController.AgeGroupSelect();
                        break;
                    case 3:
                    	ChickController.TimeGroupSelect();
                        break;
                    case 4:
                    	ChickController.GenderGroupSelect();
                        break;
                    case 5:
                        System.out.println("종료");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("잘못되었습니다..다시 입력해주세요.");
                }

            }catch (NumberFormatException e) {
                System.out.println("메뉴는 숫자만 가능합니다.");
            }
        }//while문

    }
}
