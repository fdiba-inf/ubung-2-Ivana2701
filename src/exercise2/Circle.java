package exercise2;

import java.util.Scanner;
public class Circle 
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
          double radius = input.nextDouble();
          double Area =  (Math.PI) * radius * radius;
          double Circumference = 2 * (Math.PI) * radius;
          
        System.out.println("Circumference: " + Circumference ); 
        System.out.println("Area: " + Area); 
    }

}
