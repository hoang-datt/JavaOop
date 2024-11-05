
public class PhuongTrinhBac1 {
    private double a;
    private double b;
    
    public PhuongTrinhBac1(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double giaiPhuongTrinh() {
        if (a == 0) {
            if( b == 0) {
                System.out.println("phuong trinh vo nghiem: ");
            } else {
                System.out.println("phuong trinh vo nghiem: ");
            }
        } else {
            double x = -b / a;
            System.out.printf("phuong trinh co nghiem x = %.2f\n", x);
        }
        return 0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
}
