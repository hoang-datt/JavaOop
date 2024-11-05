
import java.util.Scanner;

public class MangSoThuc {

    private double[] mang;
    private int n;

    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong phan tu cua mang: ");
        n = sc.nextInt();
        mang = new double[n];

        System.out.println("nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("phan tu " + (i + 1) + ": ");
            mang[i] = sc.nextDouble();
        }
    }

    public double TIM_MAX() {
        double max = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        return max;
    }

    public double TIM_MIN() {
        double min = mang[0];
        for (int i = 1; i < n; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }
        return min;
    }

    public void XUAT() {
        System.out.println("mang da nhap:");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }
}
