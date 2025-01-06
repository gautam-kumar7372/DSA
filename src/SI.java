import java.sql.SQLOutput;
import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a principle amount:");
        int p=sc.nextInt();
        System.out.println("Enter a tanure: ");
        int t=sc.nextInt();
        System.out.println("Enter an interest: ");
        int i=sc.nextInt();
        double interest=p*t*i/100;
        System.out.println("The interest is: "+interest);
    }
}
