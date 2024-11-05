/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MainHinhTron1 {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();
        
        hinhTron.Nhap();
        
        double chuVi = hinhTron.tinhChuVi();
        System.out.printf("chu vi hinh tron la: %.2f\n", chuVi);
        
        double dienTich = hinhTron.tinhDienTich();
        System.out.printf("dien tich hinh tron la: %.2f\n", dienTich);
    }
}
