import java.util.Scanner;

public class StudentMarksheet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("====== STUDENT MARKSHEET GENERATOR ======\n");

        System.out.print("Enter your Name: ");
        String studentName = in.nextLine();
        System.out.print("Enter your Roll No: ");
        String rollNo = in.nextLine();

        String [] subjects = {"English", "Mathematics", "Computer Science", "Physics", "Chemistry"};

        double [] marks = new double[5];

        System.out.println("\nEnter marks of 5 subjects: ");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter marks for " + subjects[i] + ": ");
            marks[i] = in.nextDouble();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks, Should be between 0 - 100 for " + subjects[i] + ": ");
                marks[i] = in.nextDouble();

            }
        }
                double totalMarks = 0;
                for (double  mark : marks) {
                    totalMarks += mark;
                }

                double averageMarks = totalMarks/marks.length;
                double percentage = (totalMarks/500)*100;

                String grade;
                if (percentage >= 90) {
                    grade = "A+";
                } else if (percentage >= 80) {
                    grade = "A";
                } else if (percentage >= 70) {
                    grade = "B";
                } else if (percentage >= 60) {
                    grade = "C";
                } else {
                    grade = "Fail";
                }

                System.out.println("\n=== STUDENT MARKSHEET ===");
                System.out.println("Student Name: " + studentName);
                System.out.println("Roll Number: " + rollNo);

                System.out.println("\nSubject-wise Marks:");
                for (int i = 0; i < subjects.length; i++) {
                    System.out.println(subjects[i] + ": " + marks[i]);                }

                System.out.println("\nPerformance Summary:");
                System.out.print("Total Marks: " + totalMarks);
                System.out.print("Average Marks: " + averageMarks);
                System.out.print("Percentage: " + percentage);
                System.out.println("Grade: " + grade);

                in.close();

    }
}
