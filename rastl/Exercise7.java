import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		Scanner getPopulation = new Scanner(System.in);
		int population = 0;
        while (population <= 0) {
    		System.out.println("Enter population of Wibbletown");
    		population = getPopulation.nextInt();
    		if (population <= 0) {
    	        System.out.println("Population of Wibbletown must be greater than 0, re-enter");
    		}
        }
        System.out.println("Population of Wibbletown is " + population);
		getPopulation.close();
	}
}