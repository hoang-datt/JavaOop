
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainSach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Sach> danhSachSach = new ArrayList<>();
        
        System.out.print("nhap so luong sach: ");
        int n = sc.nextInt();
        
        sc.nextLine();
        
        for(int i = 0; i < n; i++) {
            System.out.println("nhap thong tin cho sach thu " + (i + 1) + ":\n");
            Sach sach = new Sach();
            sach.nhap();
            danhSachSach.add(sach);
        }
        
        System.out.println("\ndanh sach Sach da nhap:\n");
        for(Sach sach : danhSachSach) {
            sach.xuat();
        }
    }
}
