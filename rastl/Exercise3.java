import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args){
		System.out.println("Enter 4 digit integer");
		Scanner number = new Scanner(System.in);
		int inputNumber = number.nextInt();
		number.close();
		
		int firstDigit = (inputNumber % 10000) / 1000;
		int secondDigit = (inputNumber % 1000) / 100;
		int thirdDigit = (inputNumber % 100) / 10;
		int fourthDigit = inputNumber % 10;
		System.out.println("First digit " + firstDigit);
		System.out.println("Second digit " + secondDigit);
		System.out.println("Third digit " + thirdDigit);
		System.out.println("Fourth digit " + fourthDigit);
	}
}
