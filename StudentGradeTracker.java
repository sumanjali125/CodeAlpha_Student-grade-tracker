import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student " + (i + 1) + " marks:");
            marks.add(sc.nextInt());
        }

        int total = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);

        for (int mark : marks) {
            total += mark;

            if (mark > highest) {
                highest = mark;
            }

            if (mark < lowest) {
                lowest = mark;
            }
        }

        double average = (double) total / n;

        System.out.println("\n--- REPORT ---");
        System.out.println("Total Students: " + n);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}