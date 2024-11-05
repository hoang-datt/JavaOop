
import java.util.Scanner;


public class HangHoa {
    private String maHang;
    private String tenHang;
    private int donGia;
    private int soLuong;
    
    public void  nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap ma hang: ");
        maHang = sc.nextLine();
        
        System.out.print("nhap ten hang: ");
        tenHang = sc.nextLine();
        
        System.out.print("nhap don gia: ");
        donGia = sc.nextInt();
        
        System.out.print("nhap so luong: ");
        soLuong = sc.nextInt();
    }
    
    public void xuat() {        
        System.out.println("ma hang hoa: " + maHang);
        System.out.println("ten hang hoa: " + tenHang);
        System.out.println("don gia hang hoa: " + donGia);
        System.out.println("so luong hang hoa: " + soLuong);
        System.out.println("");
    }
}
