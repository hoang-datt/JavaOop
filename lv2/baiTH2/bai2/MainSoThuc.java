
public class MainSoThuc {
    public static void main(String[] args) {
        MangSoThuc mangSoThuc = new MangSoThuc();

        mangSoThuc.NHAP();

        mangSoThuc.XUAT();

        double max = mangSoThuc.TIM_MAX();
        double min = mangSoThuc.TIM_MIN();
        System.out.println("Phần tử lớn nhất: " + max);
        System.out.println("Phần tử nhỏ nhất: " + min);
    }
}
