package FIRST;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = sc.nextInt();
        int total = 1;
        for(int i=n;i>0;i--){
            total*=i;
            System.out.println(i);
        }
        System.out.println("The total is: "+total);
    }
}
