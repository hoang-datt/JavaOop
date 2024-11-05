
import java.util.Scanner;


public class MainCV_DT_TamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap vao gia tri cua a: ");
        double a = sc.nextDouble();
        
        System.out.println("nhap vao gia tri cua b: ");
        double b = sc.nextDouble();
        
        System.out.println("nhap vao gia tri cua c: ");
        double c = sc.nextDouble();
        
        CV_DT_TamGiac tamGiac = new CV_DT_TamGiac(a, b, c);
        
        double chuVi = tamGiac.tinhChuVi();
        double dienTich = tamGiac.tinhDienTich();
        
        System.out.println("chu vi cua tan giac la: " + chuVi);
        System.out.printf("dien tich cua tam giac la: %.2f\n", dienTich);
    }
}
