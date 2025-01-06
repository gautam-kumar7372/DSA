import java.util.Scanner;

public class areaOfcircle {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        double r=sc.nextDouble();
        double area=0;
         area=Math.PI*r*r;
         System.out.println("The area of the circle is "+area);
    }
}
