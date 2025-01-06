import java.util.Scanner;
import java.io.*;

public class leetcodeP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int add=0;
        int pro=1;
        int subtr=0;
        int lastdigit=0;
        for(int i = 0; i <=n; i++ ){
           lastdigit=n%10;
           add+=lastdigit;
           pro*=lastdigit;

           n=n/10;

        }

        subtr=pro-add;
        System.out.println("subtract : "+subtr);

    }
}
