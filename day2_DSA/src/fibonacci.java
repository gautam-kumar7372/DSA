import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int b=0;
        for(int i=0; i<=n; i++){
            b+=i;
            System.out.print(b+" ");
        }
        System.out.println();
    }
}
