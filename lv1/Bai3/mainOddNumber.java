
import java.util.Scanner;

public class mainOddNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap vao mot so nguyen: ");
        int inputNumber = sc.nextInt();

        countOddCounter counter = new countOddCounter(inputNumber);

        int oddCount = counter.countOddNumber();
        System.out.println("so luong so le tu 1 den " + inputNumber + " la: " + oddCount);
        counter.printOddNumber();

    }
}
