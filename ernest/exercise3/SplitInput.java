import java.util.Scanner;

public class SplitInput {

  public static void main (String[] args) {

    System.out.println("Enter a year");
    Scanner s = new Scanner(System.in);
    int number = s.nextInt();
    
    int thousands = number / 1000;
    number = number % 1000;
    int hundreds = number / 100; 
    number = number % 100;
    int tens = number / 10;
    int units = number % 10;
    
    System.out.println(thousands);
    System.out.println(hundreds);
    System.out.println(tens);
    System.out.println(units);

  }
}
