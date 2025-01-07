import java.util.*;

public static void Grad() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int count = in.nextInt();
        System.out.println("Enter the marks of" + count + "Subjects: ");
        float totalmarks = 0;
        for (int i = 0; i < count; i++) {
            totalmarks += in.nextInt();
        }
        System.out.println("Total marks are: " + totalmarks);
        float percentage = (totalmarks / (count * 100)) * 100;
        if (percentage > 90 && percentage <= 100) {
            System.out.println("Grade is: AA");
        }
        if (percentage > 80 && percentage <= 90) {
            System.out.println("Grade is: AB");
        }
        if (percentage > 70 && percentage <= 80) {
            System.out.println("Grade is: BB");
        }
        if (percentage > 60 && percentage <= 70) {
            System.out.println("Grade is: BC");
        }
        if (percentage > 50 && percentage <= 60) {
            System.out.println("Grade is: CD");
        }
        if (percentage < 40 && percentage <= 50) {
            System.out.println("Grade is: DD");
        }
        if (percentage <= 40) {
            System.out.println("Fail");
        }
    }

public static void main(String[] args) {
    Grad();
}