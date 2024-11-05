import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Hang_Hoa {
    private String maHang;     
    private String tenHang;     
    private int soLuong;       
    private double giaBan;     

 
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap ma hang: ");
        maHang = sc.nextLine();
        
        System.out.print("nhap ten hang: ");
        tenHang = sc.nextLine();
        
        System.out.print("nhap so luong: ");
        soLuong = sc.nextInt();
        
        System.out.print("nhap gia ban: ");
        giaBan = sc.nextDouble();
        
        sc.nextLine();
    }


    public void xuatThongTin() {
        System.out.println("ma hang: " + maHang);
        System.out.println("ten hang: " + tenHang);
        System.out.println("so luong: " + soLuong);
        System.out.println("gia ban: " + giaBan);
    }


    public double thanhTien() {
        return soLuong * giaBan;
    }
}


class Hoa_Don {
    private String maHoaDon;          
    private String donViNhan;        
    private String nguoiThanhToan;    
    private String nguoiNhan;        
    private String ngayThanhToan;   
    private List<Hang_Hoa> danhSachHangHoa; 

    // Constructor
    public Hoa_Don() {
        danhSachHangHoa = new ArrayList<>();
    }


    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap ma hang hoa: ");
        maHoaDon = sc.nextLine();
        
        System.out.print("nhap don vi hang hoa: ");
        donViNhan = sc.nextLine();
        
        System.out.print("nhap nguoi thanh toan: ");
        nguoiThanhToan = sc.nextLine();
        
        System.out.print("nhap nguoi nhan: ");
        nguoiNhan = sc.nextLine();
        
        System.out.print("nhap ngay thanh toan: ");
        ngayThanhToan = sc.nextLine();
        
        System.out.print("nhap so luong hang hoa: ");
        int n = sc.nextInt();
        sc.nextLine(); 


        for (int i = 0; i < n; i++) {
            System.out.println("nhap thong tin cho hang hoa " + (i + 1) + ":");
            Hang_Hoa hangHoa = new Hang_Hoa();
            hangHoa.nhapThongTin();
            danhSachHangHoa.add(hangHoa);
        }
    }


    public void xuatThongTin() {
        System.out.println("ma hoa don: " + maHoaDon);
        System.out.println("don vi nhan hang: " + donViNhan);
        System.out.println("nguoi thanh toan: " + nguoiThanhToan);
        System.out.println("nguoi nhan: " + nguoiNhan);
        System.out.println("ngay thanh toan: " + ngayThanhToan);
        System.out.println("danh sach hang hoa:");

        for (Hang_Hoa hangHoa : danhSachHangHoa) {
            hangHoa.xuatThongTin();
            System.out.println("tong tien cho hang hoa: " + hangHoa.thanhTien());
        }

        System.out.printf("tong tien cua hoa don: %.2f\n", tongTien());
    }


    public double tongTien() {
        double tong = 0;
        for (Hang_Hoa hangHoa : danhSachHangHoa) {
            tong += hangHoa.thanhTien();
        }
        return tong;
    }
}