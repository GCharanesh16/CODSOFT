import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained in each subject (out of 100):");
        System.out.println("Enter ur 1st Subject mark ");
        int subject1Marks = scanner.nextInt();
        System.out.println("Enter ur 2nd Subject mark ");
        int subject2Marks = scanner.nextInt();
        System.out.println("Enter ur 3rd Subject  mark ");
        int subject3Marks = scanner.nextInt();
        System.out.println("Enter ur 4th Subject  mark ");
        int subject4Marks = scanner.nextInt();
        System.out.println("Enter ur 5th Subject  mark ");
        int subject5Marks = scanner.nextInt();

        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;

        double averagePercentage = totalMarks / 5.0;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "FAIL";
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
    }
}
