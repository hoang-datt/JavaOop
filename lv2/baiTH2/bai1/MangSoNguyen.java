
import java.util.Scanner;

public class MangSoNguyen {

    private int[] mang;
    private int n;

    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so luong phan tu cua mang: ");
        n = sc.nextInt();
        mang = new int[n];

        System.out.println("nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("phan tu " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }
    }

    public void SAP_XEP() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mang[i] > mang[j]) {
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
        }
    }

    public void XUAT() {
        System.out.println("mang sau khi sap xep tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println();
    }
}
