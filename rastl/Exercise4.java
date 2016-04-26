import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args){
		System.out.println("Enter 2 digit test score");
		Scanner percentage = new Scanner(System.in);
		int inputPercent = percentage.nextInt();
		percentage.close();
		
		String grade = "";
		if (inputPercent < 60) {
			grade = "F";
		} else if (inputPercent < 70) {
			grade = "D";
		} else if (inputPercent < 80) {
			grade = "C";
		} else if (inputPercent < 90) {
			grade = "B";
		} else {
			grade = "A";
		}

		System.out.println("Grade " + grade);
	}
}
