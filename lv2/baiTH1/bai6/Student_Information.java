
public class Student_Information {
    private String name;
    private int day;
    private int month;
    private int year;
    private String gender;
    private double averageScore;
    private String morality;
    
    public Student_Information(String name,int day,int month,int year,String gender,double averageScore,String morality) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.gender = gender;
        this.averageScore = averageScore;
        this.morality = morality;
    }
    
    public void Infor() {
        System.out.println("thong tin hoc sinh:");
        System.out.println("ho va ten: " + name);
        System.out.println("ngay sinh: " + day + "/" + month + "/" + year);
        System.out.println("gioi tinh: " + gender);
        System.out.println("diem trung binh: " + averageScore);
        System.out.println("xep hang dao duc: " + morality);
    }
}
