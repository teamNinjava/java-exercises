public class Exercise9 {
	private int validHour;
	private int validMinute;
	private String AMPM = "";
	private int selectHour;
	private int selectMinute;
	private boolean timeValid;
	private boolean morning;

	public Exercise9(int hour, int minute) {
		this.selectHour = hour;
		this.selectMinute = minute;
	}

	public static void main(String[] args) {
		Exercise9 time = new Exercise9(0, 0);
		time.setHour(0);
		time.setMinute(6);
		if (time.isValid(time.getHour(), time.getMinute())) {
			time.setTime(time.getHour(), time.getMinute());

			if (time.isAM()) {
				time.setAMPM("AM");
			} else {
				time.setAMPM("PM");
			}

			System.out.println("Time: " + String.format("%02d", time.validHour)
					+ ":" + String.format("%02d", time.validMinute) + " "
					+ time.AMPM);
		} else {
			System.out.println("Invalid time");
		}
	}

	public int getHour() {
		return selectHour;
	}

	public void setHour(int hour) {
		this.selectHour = hour;
	}

	public int getMinute() {
		return selectMinute;
	}

	public void setMinute(int minute) {
		this.selectMinute = minute;
	}

	public String getAMPM() {
		return AMPM;
	}

	public void setAMPM(String aMPM) {
		AMPM = aMPM;
	}

	private void setTime(int hour, int minute) {
		validHour = hour;
		validMinute = minute;
	}

	private boolean isValid(int selectHour, int selectMinute) {
		timeValid = true;
		if (selectHour < 0 || selectHour > 23) {
			timeValid = false;
		}
		if (selectMinute < 0 || selectMinute > 59) {
			timeValid = false;
		}

		return timeValid;
	}

	private boolean isAM() {
		morning = true;
		if (validHour == 0) {
			validHour = 24;
		}

		if (validHour > 12) {
			validHour -= 12;
			morning = false;
		}

		return morning;
	}

}
