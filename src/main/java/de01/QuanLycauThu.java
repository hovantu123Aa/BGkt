/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class QuanLycauThu {

    static ArrayList<Cauthu> danhsachcauthu;

    public void khoitaodanhsachcauthu() {
        danhsachcauthu = new ArrayList<>();
        danhsachcauthu.add(new Cauthu(01, "navas", 1995, 150000, 1000, 500));
        danhsachcauthu.add(new Cauthu(07, "ronaldo", 1985, 1000000, 10000, 5000));
        danhsachcauthu.add(new Cauthu(11, "bale", 1992, 140000, 1100, 600));
        danhsachcauthu.add(new Cauthu(06, "moric", 1995, 150000, 1000, 500));
        danhsachcauthu.add(new Cauthu(05, "benzenma", 1995, 150000, 1000, 500));
        danhsachcauthu.add(new Cauthu(04, "casemiro", 1995, 150000, 1000, 500));
        danhsachcauthu.add(new Cauthu(03, "cavarhan", 1995, 150000, 1000, 500));
        danhsachcauthu.add(new Cauthu(02, "ramos", 1990, 13000, 4000, 3000));
        danhsachcauthu.add(new Cauthu(10, "kroos", 1990, 23000, 50000, 5000));
        danhsachcauthu.add(new Cauthu(03, "pepe", 1995, 150000, 1000, 500));

    }

    public void themCauThu(Cauthu cauThuMoi) {
        for (Cauthu CT : danhsachcauthu) {
            if (CT.getSoao() == cauThuMoi.getSoao()) {
                System.out.println("So ao da co roi nha Khong the them cau thu khi trung so ao");
                return;
            }
        }
        danhsachcauthu.add(cauThuMoi);
    }

    private static void xuatthongtincauthu() {
        System.out.println("---danh sach cau thu---");
        for (Cauthu ct : danhsachcauthu) {
            ct.xuat();
        }
    }

    private static void xuatthongtincauthuluongmax() {
        for (Cauthu ct : danhsachcauthu) {
            if (ct.tinhluongthuclanh()) {

            }
        
    
        

    private static void sapXepTheoLuong() {
        Comparator<Cauthu> ct = new Comparator<Cauthu>() {
            @Override
            public int compare(Cauthu o1, Cauthu o2) {

            
        }
    }

}
