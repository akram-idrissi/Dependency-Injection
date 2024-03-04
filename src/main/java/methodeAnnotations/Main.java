package methodeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

			ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
			Animal animal = context.getBean(Animal.class);
			animal.makeSound();
	}

}
