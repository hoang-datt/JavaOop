
import java.util.Scanner;

public class MainDoanhNghiep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng doanh nghiệp: ");
        int n = sc.nextInt();
        sc.nextLine();

        DoanhNghiep[] doanhNghieps = new DoanhNghiep[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho doanh nghiệp " + (i + 1) + ":");
            doanhNghieps[i] = new DoanhNghiep();
            doanhNghieps[i].nhapThongTin();
        }

        System.out.println("\nThông tin các doanh nghiệp đã nhập:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nDoanh nghiệp " + (i + 1) + ":");
            doanhNghieps[i].xuatThongTin();
        }
    }
}
