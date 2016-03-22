

import static org.junit.Assert.*;

import org.junit.Test;

public class SwitchTest {

	@Test
	public void firstMonthIsJanuary() {
		int monthNumber = 1;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("January", month.getName());
	}
	
	@Test
	public void secondMonthIsFebruary() {
		int monthNumber = 2;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("February", month.getName());
	}
	
	@Test
	public void thirdMonthIsMarch() {
		int monthNumber = 3;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("March", month.getName());
	}
	@Test
	public void fourthMonthIsApril() {
		int monthNumber = 4;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("April", month.getName());
	}
	@Test
	public void fifthhMonthIsMay() {
		int monthNumber = 5;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("May", month.getName());
	}
	@Test
	public void sixthMonthIsJune() {
		int monthNumber = 6;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("June", month.getName());
	}
	@Test
	public void sevnthMonthIsJuly() {
		int monthNumber = 7;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("July", month.getName());
	}
	@Test
	public void eighthMonthIsAugest() {
		int monthNumber = 8;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("Augest", month.getName());
	}
	@Test
	public void ninthMonthIsSeptember() {
		int monthNumber = 9;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("September", month.getName());
	}
	@Test
	public void tenthMonthIsOctober() {
		int monthNumber = 10;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("October", month.getName());
	}
	@Test
	public void eleventhMonthIsNovember() {
		int monthNumber = 11;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("November", month.getName());
	}
	@Test
	public void twelfthMonthIsDecember() {
		int monthNumber = 12;
		MonthSwitch month = new MonthSwitch(monthNumber);
		month.monthSwitcher();
		assertEquals("December", month.getName());
	}

}
