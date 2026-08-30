// Assignment 03 - Question 08: Student Marks Analysis
public class Q08 {
    static void analyzeMarks(int[] marks) {
        int total = 0;
        int max = marks[0];
        int min = marks[0];

        for (int mark : marks) {
            total += mark;
            if (mark > max) max = mark;
            if (mark < min) min = mark;
        }
        double average = (double) total / marks.length;

        System.out.println("Total Student Marks Analysis:");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Mark: " + max);
        System.out.println("Lowest Mark: " + min);
    }

    public static void main(String[] args) {
        int[] studentMarks = {78, 85, 92, 64, 88};

        System.out.print("Student Marks: ");
        for (int m : studentMarks) System.out.print(m + " ");
        System.out.println();

        analyzeMarks(studentMarks);
    }
}