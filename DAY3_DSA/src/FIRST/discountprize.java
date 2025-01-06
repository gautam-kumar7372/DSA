package FIRST;

import java.util.Scanner;

public class discountprize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Product amount: ");
        int pp= sc.nextInt();
        System.out.print("Enter the discount amount: ");
        int Df= sc.nextInt();
        int Dp=0;
        int finalp=0;
        Dp=pp*Df/100;
        finalp=pp-Dp;
        System.out.println("The final amount after discount amount is "+finalp);
    }
}
