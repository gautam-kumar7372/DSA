import java.util.Scanner;

public class curencycnvt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a amount in rupees: ");
        double rupees = sc.nextDouble();

        double usd = rupees/88.00;
        System.out.println("The USD is " + usd);
    }
}
