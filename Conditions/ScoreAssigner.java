
public class ScoreAssigner {

	public static String assignScore(int score) {
		String result = "F";
		if (score > 89) {
			result = "A";
		}
		else if (score > 79) {
			result = "B";
		}
		else if (score > 69) {
			result = "C";
		}
		else if (score > 59) {
			result = "D";
		}
		return result;
	}

}
