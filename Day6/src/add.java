import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        add(a,b);

    }
    public static int add(int a, int b){
        int total=0;
        total=a+b;
        System.out.print("The sum is "+total);
        return 0;
    }
}
