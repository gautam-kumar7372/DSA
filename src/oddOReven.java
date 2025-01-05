import java.util.Scanner;

public class oddOReven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("it's a Even number");
        }else {
            System.out.println("it's a odd number");
        }
    }
}
