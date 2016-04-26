
public class Animal {
	public String breed;
	public String name;
	public String venomous;

	public String poisonous(String breed) {
		if (breed == "dog") {
			venomous = "not poisonous";
		} else {
			venomous = "poisonous";
		}
		
		return venomous;
	}
}	

