package methodeDynamique;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		try {
			System.out.println("Methode Dynamique");
			Scanner scanner = new Scanner(new File("./src/main/java/methodeDynamique/config.txt"));
			
			String catString = scanner.nextLine();
			String dogString = scanner.nextLine();
			
			Class<?> catClass = Class.forName(catString);
			Class<?> dogClass = Class.forName(dogString);
			
			CatSound catInstance = (CatSound) catClass.newInstance();
			DogSound dogInstance = (DogSound) dogClass.newInstance();
			
			Animal animal = new Animal();
			animal.makeSound(catInstance);
			animal.makeSound(dogInstance);
			
			
		} catch (FileNotFoundException | ClassNotFoundException |
				InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
