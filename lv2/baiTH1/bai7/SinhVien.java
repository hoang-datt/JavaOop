
import java.util.Scanner;

public class SinhVien {

    private String mssv;
    private String name;
    private int age;
    private double averageScore;

    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap mssv: ");
        mssv = sc.nextLine();
        
        System.out.print("nhap ho ten: ");
        name = sc.nextLine();
        
        System.out.print("nhap tuoi: ");
        age = sc.nextInt();
        
        System.out.print("nhap diem: ");
        averageScore = sc.nextDouble();
        
        sc.nextLine();
    }

    public void xuat() {
        System.out.println("thong tin sinh vien: ");
        System.out.println("ma so sinh vien: " + mssv);
        System.out.println("ho va ten: " + name);
        System.out.println("tuoi: " + age);
        System.out.println("diem: " + averageScore);
    }
}
