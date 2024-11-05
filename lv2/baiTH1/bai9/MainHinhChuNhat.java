
public class MainHinhChuNhat {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.NHAP();
        hcn.VE();
        
        System.out.println("dien tich hinh chu nhat la: " + hcn.dienTich());
        System.out.println("chu vi hinh chu nhat la: " + hcn.chuVi());
    }
}
