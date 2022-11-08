package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.WebtoonController;
import com.kh.model.vo.Webtoon;

public class WebtoonView {

    private Scanner sc = new Scanner(System.in);
    
    private WebtoonController wc = new WebtoonController();
    private ArrayList<Webtoon> wList = wc.printAll();
    
    
    // 메인 메뉴
    public void mainMenu() {
        while (true) {
            System.out.println("1. 전체 웹툰 조회");
            System.out.println("2. 요일별 웹툰 조회");
            System.out.println("3. 웹툰 검색");
            System.out.println("0. 종료");
            System.out.print("메뉴 입력 : ");
            int menu = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (menu) {
            case 1: printAll();
                break;
            case 2: byDayPrint();
                break;
            case 3: search();
                break;
            case 0: System.out.println("프로그램을 종료합니다.");
                return;
            default: System.out.println("잘못 누르셨습니다.");
            }
        }
    }
    
    // 전체 웹툰 조회
    public void printAll() {
        for(int i = 0; i < wList.size(); i++) {
            System.out.println("[" + wList.get(i).getWebtoonNo() + "] \t" + wList.get(i).getDay() + "\t" + wList.get(i).getTitle());
        }
        System.out.println();
        
        System.out.println("보고싶은 웹툰의 번호를 입력해주세요.");
        System.out.println("뒤로가기는 -1");
        System.out.print("> ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println();
            return;
        } else {
            System.out.println();
            detailView(num);
        }
        
    }

    
    // 요일별 웹툰 조회
    public void byDayPrint() {
        while (true) {
            System.out.println("월 화 수 목 금 토 일");
            System.out.println("(뒤로가기는 0을 입력해주세요.)");
            System.out.print("보고싶은 요일 : ");
            String day = sc.nextLine();
            
            if (day.equals("0")) {
                System.out.println();
                return;
            }
            switch (day) {
            case "월" : day = "mon"; break;
            case "화" : day = "tue"; break;
            case "수" : day = "wed"; break;
            case "목" : day = "thu"; break;
            case "금" : day = "fri"; break;
            case "토" : day = "sat"; break;
            case "일" : day = "sun"; break;
            default : System.out.println("잘못 입력하셨습니다.");
            }
            
            ArrayList<Webtoon> dayToon = wc.byDayPrint(day);
            for(int i = 0; i < dayToon.size(); i++) {
                System.out.println("[" + dayToon.get(i).getWebtoonNo() + "] \t" + dayToon.get(i).getTitle());
            }
            System.out.println();
            
            System.out.println("보고싶은 웹툰의 번호를 입력해주세요.");
            System.out.println("뒤로가기는 -1");
            System.out.print("> ");
            int num = sc.nextInt();
            
            if (num < 0) {
                System.out.println();
                return;
            } else {
                System.out.println();
                detailView(num);
            }
        }
        
    }
    
    // 검색
    public void search() {
        System.out.println("제목/작가로 검색할 수 있습니다.");
        System.out.print(">");
        String keyword = sc.nextLine();
        
        ArrayList<Webtoon> searched = wc.searched(keyword);
        
        if (searched.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println("조회 결과 " + searched.size() + "건");
            for(int i = 0; i < searched.size(); i++) {
                System.out.println("[" + searched.get(i).getWebtoonNo() + "] \t" + searched.get(i).getTitle() + "\t" + searched.get(i).getCartoonist());
            }
        }
        System.out.println();
        
        System.out.println("보고싶은 웹툰의 번호를 입력해주세요.");
        System.out.println("뒤로가기는 -1");
        System.out.print("> ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println();
            return;
        } else {
            System.out.println();
            detailView(num);
        }
    }
    
    // 웹툰 상세보기
    public void detailView(int num) {
        System.out.println(wList.get(num).getTitle() + wList.get(num).getCartoonist());
        System.out.println(wList.get(num).getPlot());
        System.out.println();
        System.out.println("보러가기 \t" + wList.get(num).getLink());
        System.out.println();
    }
}
