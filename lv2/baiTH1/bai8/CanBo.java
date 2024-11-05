
import java.util.Scanner;


public class CanBo {
    private String maCanBo;
    private String hoTen;
    private String ngaySinh;
    private int soNgayLamViecTrongThang;
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap ma can bo: ");
        maCanBo = sc.nextLine();
        
        System.out.println("ho va ten can bo: ");
        hoTen = sc.nextLine();
        
        System.out.println("ngay thang nam sinh can bo: ");
        ngaySinh = sc.nextLine();
        
        
        System.out.println("so ngay lam viec cua can bo: ");
        soNgayLamViecTrongThang = sc.nextInt();
    }
    
    public double tinhLuong() {
        return soNgayLamViecTrongThang * 250000;
    }
    
    public void xuat() {
        System.out.println("thong tin cua can bo");
        System.out.println("ma can bo: " + maCanBo);
        System.out.println("ho va ten can bo: " + hoTen);
        System.out.println("ngay thang nam sinh can bo: " + ngaySinh);
        System.out.println("so ngay lam viec cua can bo: " + soNgayLamViecTrongThang);
        System.out.println("Luong: " + tinhLuong() + "VND");
    }
}
