import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a four digit number : ");
        int input = keyboard.nextInt();

        int firstDigit = input / 1000;
        int secondDigit = (input % 1000) / 100;
        int thirdDigit = (input % 100) / 10;
        int fourthDigit = input % 10;

        System.out.println("1st digit : " + firstDigit);
        System.out.println("2nd digit : " + secondDigit);
        System.out.println("3rd digit : " + thirdDigit);
        System.out.println("4th digit : " + fourthDigit);
    }
}
