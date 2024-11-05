
public class HinhThang {
    private double dayLon;
    private double dayNho;
    private double chieuCao;
    
    public HinhThang(double dayLon, double dayNho, double chieuCao) {
        this.dayLon = dayLon;
        this.dayNho = dayNho;
        this.chieuCao = chieuCao;
    }
    
    public double tinhDienTich() {
        return ((dayNho + dayLon) * chieuCao) / 2;
    }

    public double getDayNho() {
        return dayNho;
    }

    public void setDayNho(double dayNho) {
        this.dayNho = dayNho;
    }

    public double getDayLon() {
        return dayLon;
    }

    public void setDayLon(double dayLon) {
        this.dayLon = dayLon;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    
    
}
