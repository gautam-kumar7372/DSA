package FIRST;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number: ");
        double n = sc.nextInt();
        double sum=0;
        double avg=0;
        for(int i=0;i<=n;i++){
            sum+=i;
            avg=sum/n;


        }
//        System.out.println(sum);
        System.out.println("The average of "+n+" numbers is "+avg);
    }
}
