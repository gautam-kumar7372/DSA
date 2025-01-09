import java.util.Scanner;

public class calling {
    public static void main(String[] args) {
        call();
        recive();




    }
    public static int call() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mobile number: ");
        long number = sc.nextLong();
        if (number > 999999999 ) {
            System.out.println("Call is ringing....");
        }else {
            System.out.println("Wrong number..");
        }
        return 0;
    }
    public static String recive() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to recive the call ? ");
        String call = sc.nextLine();
        if(call.equals("yes")){
            System.out.print("pick up the call. ");
        }else if(call.equals("no")){
            System.out.print("cut up the call. ");
        }
        return "";
    }
}
