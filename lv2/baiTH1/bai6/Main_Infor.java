
import java.util.Scanner;


public class Main_Infor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap ho ten: ");
        String name = sc.nextLine();
        
        System.out.println("nhap ngay sinh: ");
        int day = sc.nextInt();
        
        System.out.println("nhap thang sinh: ");
        int month = sc.nextInt();
        
        System.out.println("nhap nam sinh: ");
        int year = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("nhap gioi tinh: ");
        String gender = sc.nextLine();
        
        System.out.println("nhap diem trung binh: ");
        double averageScore = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.println("nhap xep loai dao duc: ");
        String morality = sc.nextLine();
        
        Student_Information student = new Student_Information(name, day, month, year, gender, averageScore, morality);
        
        student.Infor();
    }
}
