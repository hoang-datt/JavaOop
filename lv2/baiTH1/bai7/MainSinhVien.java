
public class MainSinhVien {
    public static void main(String[] args) {
        SinhVien a = new SinhVien();
        SinhVien b = new SinhVien();
        
        System.out.println("\nnhap thong tin cua sinh vien a: ");
        a.nhap();
        
        System.out.println("\nnhap thong tin cua sinh vien b: ");
        b.nhap();
        
        System.out.println("\nthong tin cua sinh vien a: ");
        a.xuat();
        
        System.out.println("\nthong tin cua sinh vien b: ");
        b.xuat();
    }
}
