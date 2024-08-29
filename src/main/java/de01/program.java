/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class program {
    public static void main(String[] args) {
        
        do {
            Scanner sc=new Scanner(System.in);
            System.out.println("1. Them cau thu moi");
            System.out.println("2. Xuat thong tin danh sach cau thu");
            System.out.println("3. Tim cau thu co luong cao nhat");
            System.out.println("4. Sap xep danh sach theo luong tang dan");
            System.out.println("5. Tinh luong trung binh cua cau thu");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    System.out.println("Nhap thong tin cau thu moi:");
                    System.out.print("So ao: ");
                    int soAo = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ho ten: ");
                    String hoTen = scanner.nextLine();
                    System.out.print("Nam sinh: ");
                    int namSinh = scanner.nextInt();
                    System.out.print("Luong cung: ");
                    double luongCung = scanner.nextDouble();
                    System.out.print("Tien thuong: ");
                    double tienThuong = scanner.nextDouble();
                    System.out.print("Tien phat: ");
                    double tienPhat = scanner.nextDouble();

                    CauThu cauThuMoi = new CauThu(soAo, hoTen, namSinh, luongCung, tienThuong, tienPhat);
                case 1:  
                    quanLy.themCauThu(cauThuMoi);
                    break;
                case 2:
                    quanLy.xuatThongTin();
                    break;
                case 3:
                    quanLy.timCauThuLuongThapNhat();
                    break;
               case 4:
                  quanLy.sapXepTheoLuong();
                   quanLy.xuatThongTin();
                  break;
              case 5:
                   System.out.println("luong  trung binh cua cac cau thu: ") ;
                      break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (chon != 0);
    }
    }
}
