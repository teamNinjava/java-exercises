
public class Exercise8 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.breed = "dog";
		animal.name = "Henry";

		System.out.println(animal.name + " the " + animal.breed + " is " + animal.poisonous(animal.breed) + "!");
	}
}
