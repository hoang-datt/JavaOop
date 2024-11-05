
import java.util.Scanner;


public class HinhChuNhat {
    private double chieudai;
    private double chieurong;
    
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap chieu dai: ");
        chieudai = sc.nextDouble();
        
        System.out.print("nhap chieu rong: ");
        chieurong = sc.nextDouble();
    }
    
    public void VE() {
        System.out.println("hinh chu nhat:");
        for(int i = 0; i < chieurong; i++) {
            for(int j = 0; j < chieudai; j++) {
               if(i == 0 || i == chieurong - 1 || j ==0 || j == chieudai - 1) {
                   System.out.print("* ");
               }else {
                   System.out.print("  ");
               }
            }
            System.out.println("");
        }
    }
    
    public double dienTich() {
        return chieudai * chieurong;
    }
    
    public double chuVi() {
        return 2 * (chieudai + chieurong);
    }

}
