
import java.util.Scanner;


public class MainHinhThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai day lon: ");
        double dayLon = sc.nextDouble();
        
        System.out.println("nhap do dai day nho: ");
        double dayNho = sc.nextDouble();
        
        System.out.println("nhap chieu cao: ");
        double chieuCao = sc.nextDouble();
        
        HinhThang hinhThang = new HinhThang(dayNho, dayLon, chieuCao);
        
        double dienTich = hinhThang.tinhDienTich();
        System.out.printf("dien tich hinh thang: %.2f\n", dienTich);
        
        sc.close();
    }
}
