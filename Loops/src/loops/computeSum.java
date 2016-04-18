package loops;

public class computeSum {

	int sum;
	
	public int calculate(int maxRange) {
		for (int number = 1; number <= maxRange; number++) {
			sum += Math.pow(number,2);
		}
		return sum;
	}
}
