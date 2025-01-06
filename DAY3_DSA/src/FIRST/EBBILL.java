package FIRST;

import java.util.Scanner;

public class EBBILL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tha how much unit EB bill you used: ");
        double unit = sc.nextDouble();
        System.out.print("Enter the rate of unit: ");
        double rate = sc.nextDouble();
        double EB_Bill=0;
        EB_Bill=unit*rate;
        System.out.println("EB Bill is: "+EB_Bill);
    }
}
