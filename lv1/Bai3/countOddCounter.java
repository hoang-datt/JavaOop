
import java.util.Scanner;


public class countOddCounter {

    private int number;
    
    public countOddCounter(int number) {
        this.number = number;
    }

    public int countOddNumber() {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public void printOddNumber() {
        System.out.println("cac so le tu 1 den " + number + " la:");
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
}
