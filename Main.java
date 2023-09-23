import java.util.*;
//fahrenheit = (9 / 5) * celsius + 32

class Main {
  public static void main(String[] args) 
  {
    double c = 0 , f = 0;
    //instantiate scanner class
    Scanner input = new Scanner(System.in);
    //Ask user for celcius degree
    System.out.print("Input Celcius degree for conversion: ");
    //retrieve celcius input
    c = input.nextDouble();
    //convert to fahrenheit
    f = (9.0 / 5) * c + 32;
    //Print Results
    System.out.print("Degree in Fahrenheit is: " + f);
 
  }
}