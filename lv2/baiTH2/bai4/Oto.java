
import java.util.Scanner;

public class Oto {

    private String maOto;
    private double giaMua;
    private int soNamSuDung;
    private double tyLeKhauHao;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap ma o to: ");
        maOto = sc.nextLine();

        System.out.print("nhap gia mua moi: ");
        giaMua = sc.nextDouble();

        System.out.print("nhap so nam su dung: ");
        soNamSuDung = sc.nextInt();

        System.out.print("nhap ty le khau hao moi nam (%): ");
        tyLeKhauHao = sc.nextDouble();

        sc.nextLine();
    }

    public void xuatThongTin() {
        System.out.println("ma o to: " + maOto);
        System.out.println("gia mua moi: " + giaMua);
        System.out.println("so nam su dung: " + soNamSuDung);
        System.out.println("ty le khau hao moi nam: " + tyLeKhauHao + "%");
        System.out.printf("gia tri hien tai: %.2f\n", giaTriHienTai());
    }

    public double giaTriHienTai() {
        double khauHao = (giaMua * tyLeKhauHao / 100) * soNamSuDung;
        return giaMua - khauHao;
    }
}
