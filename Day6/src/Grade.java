import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grade of student: ");
        int marks = sc.nextInt();
        grade(marks);

    }
    public static int grade(int marks) {
        int max_grade = 100;
        if(marks >= 91 && marks <= 100) {

            System.out.println("Grade is 'AA'.");
        }else if(marks >= 81 && marks <= 90) {
            System.out.println("Grade is 'AB'.");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade is 'BB'.");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade is 'BC'.");

        } else if (marks >= 51&& marks <= 60 ) {
            System.out.println("Grade is 'CD'.");

        } else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade is 'DD'.");
        }else if(marks<=40) {
            System.out.println("Your are filed. please try again. ");
        }else {
            System.out.println("wrong input");
        }

        return 0;
    }
}
