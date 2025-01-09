import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age limit: ");
        int age = sc.nextInt();
        voteEligibility1(age);

    }
    public static int voteEligibility1(int age) {
        if(age >= 18) {
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
        return 0;
    }
}
