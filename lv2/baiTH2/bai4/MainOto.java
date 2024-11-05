
import java.util.Scanner;

public class MainOto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so luon o to: ");
        int n = sc.nextInt();
        sc.nextLine();

        Oto[] otoList = new Oto[n];

        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin cho o to " + (i + 1) + ":");
            otoList[i] = new Oto();
            otoList[i].nhapThongTin();
        }

        System.out.println("\nthong tin cac o to da nhap:");
        for (int i = 0; i < n; i++) {
            System.out.println("\no to " + (i + 1) + ":");
            otoList[i].xuatThongTin();
        }
    }
}
