
import java.util.Scanner;

public class Method {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        max_value(a, b, c);
        min_value(a, b, c);
    }

    public static void max_value(int a, int b, int c) {
        int max = a;
        if (b > a) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("maximum value is: " + max);
    }

    public static void min_value(int a, int b, int c) {
        int min = a;
        if (b < a) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        System.out.println("minimum value is: " + min);
    }
}