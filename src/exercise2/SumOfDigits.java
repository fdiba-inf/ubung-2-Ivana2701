package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 999: ");
        int number = input.nextInt();
        int d1 = number%10;
        int d2 = number/10;
        int d3 = d2%10;
        int d4 = d2/10;
        int d5 = d4%10;
        int d6 = d4/10;
      
        int sumOfDigits = d1 + d3 + d5;
     

        System.out.println("Sum of digits: " + sumOfDigits);
    }

}
