import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained in each subject (out of 100):");
        int subject1Marks = scanner.nextInt();
        int subject2Marks = scanner.nextInt();
        int subject3Marks = scanner.nextInt();
        int subject4Marks = scanner.nextInt();
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
