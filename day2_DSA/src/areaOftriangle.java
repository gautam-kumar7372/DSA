import java.util.Scanner;

public class areaOftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double b = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double h = sc.nextDouble();
        double area = (b*h)/2;
        System.out.println("The area of the triangle is: "+area);
    }
}
