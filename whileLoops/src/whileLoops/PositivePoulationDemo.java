package whileLoops;

import java.util.Scanner;

public class PositivePoulationDemo {
	
	public static void main(String[] args){
		
		boolean isValid = false;
		
		do{
			System.out.println("Please enter a positive population. ");
			Scanner keyboard = new Scanner(System.in);
			int population = keyboard.nextInt();
			if (population > 0) {
				 isValid = true;
			}
		}while (!isValid);
		
	}

}
