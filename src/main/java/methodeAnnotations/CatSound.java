package methodeAnnotations;

import org.springframework.stereotype.Component;

@Component
public class CatSound implements ISound {

	@Override
	public void sound() {
		System.out.println("Cat says: meow meow meow");
	}
}
