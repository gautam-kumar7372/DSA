package FIRST;

import java.util.Scanner;

public class JAVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        while (true){
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            if(number==0){
                break;
            }
            total+=number;

        }
        System.out.println("Total is "+total);
    }
}
