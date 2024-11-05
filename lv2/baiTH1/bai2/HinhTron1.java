
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class HinhTron1 {
    private double banKinh;
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ban kinh hinh tron: ");
        banKinh = sc.nextDouble();
    }
    
    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }
    
    public double dienTich() {
        return Math.PI * Math.pow(banKinh, 2);
    }
}
