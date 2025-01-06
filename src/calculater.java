import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int number = sc.nextInt();
        System.out.println("Enter a Second number:");
        int second = sc.nextInt();
        System.out.println("Enter a operator:");
        char operator = sc.next().charAt(0);
        int Result=0;
        if(operator == '+'){
            Result=number+second;
        }else if(operator =='-'){
            Result=number-second;
        }
        else if(operator =='*'){
            Result=number * second;
        }
        else if(operator =='/'){
            Result=number/second;
        }else System.out.println("Invalid operator");
        System.out.println(Result);
    }
}
