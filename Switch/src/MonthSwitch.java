
public class MonthSwitch {
	private String name;
	private int month;
	
	public MonthSwitch(int newMonthNumber){
		month = newMonthNumber;
	}
	
	public void monthSwitcher(){
		
		switch(month){
		case 1:
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;		
		case 4:
			name = "April";
			break;	
		case 5:
			name = "May";
			break;	
		case 6:
			name = "June";
			break;	
		case 7:
			name = "July";
			break;	
		case 8:
			name = "Augest";
			break;	
		case 9:
			name = "September";
			break;	
		case 10:
			name = "October";
			break;	
		case 11:
			name = "November";
			break;	
		case 12:
			name = "December";
			break;	
		default:
			name = "wrong month number";
		}
	}
	
	public String getName(){
		return this.name;
	}

}
