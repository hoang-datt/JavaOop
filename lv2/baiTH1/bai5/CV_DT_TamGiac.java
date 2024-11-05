
public class CV_DT_TamGiac {
    private double a;
    private double b;
    private double c;
    
    public CV_DT_TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double tinhChuVi() {
        return a + b + c;
    }
    
    public double tinhDienTich() {
        double banChuVi = tinhChuVi() / 2;
        return Math.sqrt(banChuVi * (banChuVi - a) * (banChuVi - b) * (banChuVi - c));
    }
}
