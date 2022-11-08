package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.WebtoonController;
import com.kh.model.vo.Webtoon;

public class WebtoonView {

    private Scanner sc = new Scanner(System.in);
    
    private WebtoonController wc = new WebtoonController();
    private ArrayList<Webtoon> wList = wc.printAll();
    
    
    // ���� �޴�
    public void mainMenu() {
        while (true) {
            System.out.println("1. ��ü ���� ��ȸ");
            System.out.println("2. ���Ϻ� ���� ��ȸ");
            System.out.println("3. ���� �˻�");
            System.out.println("0. ����");
            System.out.print("�޴� �Է� : ");
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
            case 0: System.out.println("���α׷��� �����մϴ�.");
                return;
            default: System.out.println("�߸� �����̽��ϴ�.");
            }
        }
    }
    
    // ��ü ���� ��ȸ
    public void printAll() {
        for(int i = 0; i < wList.size(); i++) {
            System.out.println("[" + wList.get(i).getWebtoonNo() + "] \t" + wList.get(i).getDay() + "\t" + wList.get(i).getTitle());
        }
        System.out.println();
        
        System.out.println("������� ������ ��ȣ�� �Է����ּ���.");
        System.out.println("�ڷΰ���� -1");
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

    
    // ���Ϻ� ���� ��ȸ
    public void byDayPrint() {
        while (true) {
            System.out.println("�� ȭ �� �� �� �� ��");
            System.out.println("(�ڷΰ���� 0�� �Է����ּ���.)");
            System.out.print("������� ���� : ");
            String day = sc.nextLine();
            
            if (day.equals("0")) {
                System.out.println();
                return;
            }
            switch (day) {
            case "��" : day = "mon"; break;
            case "ȭ" : day = "tue"; break;
            case "��" : day = "wed"; break;
            case "��" : day = "thu"; break;
            case "��" : day = "fri"; break;
            case "��" : day = "sat"; break;
            case "��" : day = "sun"; break;
            default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
            }
            
            ArrayList<Webtoon> dayToon = wc.byDayPrint(day);
            for(int i = 0; i < dayToon.size(); i++) {
                System.out.println("[" + dayToon.get(i).getWebtoonNo() + "] \t" + dayToon.get(i).getTitle());
            }
            System.out.println();
            
            System.out.println("������� ������ ��ȣ�� �Է����ּ���.");
            System.out.println("�ڷΰ���� -1");
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
    
    // �˻�
    public void search() {
        System.out.println("����/�۰��� �˻��� �� �ֽ��ϴ�.");
        System.out.print(">");
        String keyword = sc.nextLine();
        
        ArrayList<Webtoon> searched = wc.searched(keyword);
        
        if (searched.isEmpty()) {
            System.out.println("�˻� ����� �����ϴ�.");
        } else {
            System.out.println("��ȸ ��� " + searched.size() + "��");
            for(int i = 0; i < searched.size(); i++) {
                System.out.println("[" + searched.get(i).getWebtoonNo() + "] \t" + searched.get(i).getTitle() + "\t" + searched.get(i).getCartoonist());
            }
        }
        System.out.println();
        
        System.out.println("������� ������ ��ȣ�� �Է����ּ���.");
        System.out.println("�ڷΰ���� -1");
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
    
    // ���� �󼼺���
    public void detailView(int num) {
        System.out.println(wList.get(num).getTitle() + wList.get(num).getCartoonist());
        System.out.println(wList.get(num).getPlot());
        System.out.println();
        System.out.println("�������� \t" + wList.get(num).getLink());
        System.out.println();
    }
}
