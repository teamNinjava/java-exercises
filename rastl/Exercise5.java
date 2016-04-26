import java.util.Scanner;


public class Exercise5 {

	public static void main(String[] args) {
		System.out.println("Enter month number");
		Scanner month = new Scanner(System.in);
		int inputMonth = month.nextInt();
		month.close();
		
		String monthName = "";
		switch (inputMonth) {
		    case 1: 
			    monthName = "January";
			    break;
		    case 2: 
			    monthName = "February";
			    break;
		    case 3: 
			    monthName = "March";
			    break;
		    case 4: 
			    monthName = "April";
			    break;
		    case 5: 
			    monthName = "May";
			    break;
		    case 6: 
			    monthName = "June";
			    break;
		    case 7: 
			    monthName = "July";
			    break;
		    case 8: 
			    monthName = "August";
			    break;
		    case 9: 
			    monthName = "September";
			    break;
		    case 10: 
			    monthName = "October";
			    break;
		    case 11: 
			    monthName = "November";
			    break;
		    case 12: 
			    monthName = "December";
			    break;
            default: 
			    monthName = "Unknown";
		}
		
		System.out.println("Month is " + monthName);
		
		
	}
}