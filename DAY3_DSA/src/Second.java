import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int largest =Integer.MIN_VALUE;
       int number;
        while (true) {
            System.out.print("Enter number: ");
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
           if(number > largest) {
               largest = number;
           }

        }

        if(number>largest){
            System.out.println("No number were entered");
        }else {
            System.out.println("The largest number is"+largest);
        }
    }

    }


