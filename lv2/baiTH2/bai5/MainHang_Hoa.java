
import java.util.Scanner;


public class MainHang_Hoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap thong tin hoa don:");
        Hoa_Don hoaDon = new Hoa_Don();
        hoaDon.nhapThongTin();
        
        System.out.println("\nthong tin hoa don:");
        hoaDon.xuatThongTin();
    }
}
