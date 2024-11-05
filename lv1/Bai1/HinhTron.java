
import java.util.Scanner;

public class HinhTron {
    
    private Double banKinh;
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh hinh tron: ");
        banKinh = sc.nextDouble();
    } 
    
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }
    
    public double tinhDienTich() {
        return Math.PI * Math.pow(banKinh, 2);
    }
}

