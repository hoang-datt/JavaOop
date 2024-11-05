
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class MainPhuongTrinhBac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap vao gia tri cua a: ");
        double a = sc.nextDouble();
        
        System.out.println("nhap vao gia tri cua b: ");
        double b = sc.nextDouble();
        
        PhuongTrinhBac1 phuongTrinh = new PhuongTrinhBac1(a, b);
        phuongTrinh.giaiPhuongTrinh();
    }
}
