
import java.util.Scanner;


public class Sach {
    private String maSach;
    private String tenSach;
    private String nhaSX;
    private int soTrang;
    private double giaTien;
    
    public void  nhap() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap ma sach: ");
        maSach = sc.nextLine();
        
        System.out.print("nhap ten sach: ");
        tenSach = sc.nextLine();
        
        System.out.print("nhap nha xuat ban: ");
        nhaSX = sc.nextLine();
        
        System.out.print("nhap so trang: ");
        soTrang = sc.nextInt();
        
        System.out.print("nhap gia tien: ");
        giaTien = sc.nextDouble();
        
        sc.nextLine();
    }
    
    public void xuat() {        
        System.out.println("ma sach: " + maSach);
        System.out.println("ten sach: " + tenSach);
        System.out.println("nha xuat ban: " + nhaSX);
        System.out.println("so trang: " + soTrang);
        System.out.println("Gia tien: " + giaTien);
        System.out.println("");
    }
}
