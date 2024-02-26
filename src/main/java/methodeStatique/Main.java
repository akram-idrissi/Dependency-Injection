package methodeStatique;

public class Main {

	public static void main(String[] args) {

		Animal animal = new Animal();
		ISound catSound = new CatSound();
		ISound dogSound = new DogSound();
		
		animal.makeSound(catSound);
		animal.makeSound(dogSound);
	}

}
