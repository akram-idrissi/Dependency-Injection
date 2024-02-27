package methodesBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

			ApplicationContext context = new ClassPathXmlApplicationContext("methodesBeans/config.xml");
			CatSound catSound = (CatSound) context.getBean("catSound");
			DogSound dogSound = (DogSound) context.getBean("dogSound");
			
			Animal animal = new Animal();
			animal.makeSound(catSound);
			animal.makeSound(dogSound);
	}

}
