package exercise2;

import java.util.Scanner;

public class QuadraticEquation{

public static void main (String[] args){ Scanner input = new Scanner(System.in);
double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();

if(a!=0){
double D = Math.pow(b, 2) - 4* a * c;

if(D>=0){
double x1 = (-b + Math.sqrt(D))/2*a;
double x2 = (-b - Math.sqrt(D)/2*a);
System.out.print(x1 + ", " + x2);
}

else{
  System.out.print("Imaginary values");
}
}
else{

  if(b!=0){
    double x = -c / b;
      System.out.print("x");
  }
  else{
    if(c!=0){
      System.out.print("No values");
    }
    else{
      System.out.print("Many values");
    }
  }


}
}

}