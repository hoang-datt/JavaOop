
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainHangHoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<HangHoa> danhSachHangHoa = new ArrayList<>();
        
        System.out.print("nhap so luong hang hoa: ");
        int n = sc.nextInt();
        
        sc.nextLine();
        
        for(int i = 0; i < n; i++) {
            System.out.println("nhap thong tin cho hang hoa thu " + (i + 1) + ":\n");
            HangHoa hanghoa = new HangHoa();
            hanghoa.nhap();
            danhSachHangHoa.add(hanghoa);
        }
        
        System.out.println("\ndanh sach hang hoa da nhap:\n");
        for(HangHoa sach : danhSachHangHoa) {
            sach.xuat();
        }
    }
}
