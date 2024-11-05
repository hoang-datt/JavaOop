
import java.util.Scanner;

public class DoanhNghiep {

    private String ten;
    private String diaChi;
    private int soNhanVien;
    private double doanhThu;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap ten doanh nghiep: ");
        ten = sc.nextLine();

        System.out.print("nhap dia chi doanh nghiep: ");
        diaChi = sc.nextLine();

        System.out.print("nhap so nhan vien: ");
        soNhanVien = sc.nextInt();

        System.out.print("nhap doanh thu: ");
        doanhThu = sc.nextDouble();

        sc.nextLine();
    }

    public void xuatThongTin() {
        System.out.println("ten doanh nghiep: " + ten);
        System.out.println("dia chi doanh nghiep: " + diaChi);
        System.out.println("so nhan vien: " + soNhanVien);
        System.out.println("doanh thu: " + doanhThu);
    }
}
