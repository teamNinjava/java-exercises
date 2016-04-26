import static org.junit.Assert.*;

import org.junit.Test;


public class ConditionsTest {

	@Test
	public void higherThan89IsA() {
		String expectedResult = "A";
		String actualresult = ScoreAssigner.assignScore(90);
		assertEquals(expectedResult,actualresult);
	}
	
	@Test
	public void higherThan79LessThan90IsB() {
		String expectedResult = "B";
		String actualresult = ScoreAssigner.assignScore(80);
		assertEquals(expectedResult,actualresult);
	}
	
	@Test
	public void higherThan69LessThan80IsC() {
		String expectedResult = "C";
		String actualresult = ScoreAssigner.assignScore(70);
		assertEquals(expectedResult,actualresult);
	}
	
	@Test
	public void higherThan59LessThan70IsD() {
		String expectedResult = "D";
		String actualresult = ScoreAssigner.assignScore(60);
		assertEquals(expectedResult,actualresult);
	}
	
	@Test
	public void lessThan60IsF() {
		String expectedResult = "F";
		String actualresult = ScoreAssigner.assignScore(59);
		assertEquals(expectedResult,actualresult);
	}

}
