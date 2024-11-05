/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class PhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;
    
    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void giaiPhuongTrinh() {
        if(a == 0) {
            if(b == 0) {
                if(c == 0) {
                    System.out.println("phuong trinh co vo so nghiem: ");
                }else {
                    System.out.println("phuong trinh vo nghiem: ");
                }
            }else {
                double x = -c / b;
                System.out.printf("phuong trinh bac nhat co nghiem x = %.2f\n", x);
            }
        }else {
            double delta = b * b - 4 * a * c;
            if(delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("phuong trinh co 2 nghiem phan biet:\n x1 = %.2f\n x2 = %.2f\n", x1, x2);
            } else if(delta == 0) {
                double x = -b / 2 * a;
                System.out.printf("phuong trinh co nghiem kep: x = %.2f\n", x);
            }else {
                System.out.println("phuong trinh vo nghiem: ");
            }
        }
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
}
